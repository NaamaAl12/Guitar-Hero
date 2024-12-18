// Naama Al-Musawi, CS 145
// Assignment: GuitarHero - (GuitarString class)


import java.util.*;

public class GuitarString {
    private Queue<Double> ringBuffer;
    private int size;
    private static final int SAMPLING_RATE = 44100;
    private static final double DECAY_FACTOR = 0.996;
    
    /**
     * Constructs a guitar string of the given frequency. 
     * Initializes a ring buffer to represent a guitar string at rest.
     * @param frequency, The frequency of the guitar string.
     * @throws IllegalArgumentException if the frequency is not positive or if the ring buffer size calculated is less than 2.
     */    
    public GuitarString(double frequency) {
        size = Math.round((float) (SAMPLING_RATE / frequency));
        ringBuffer = new LinkedList<>();
        if (frequency <= 0 || SAMPLING_RATE / frequency < 2) {
            throw new IllegalArgumentException("Frequency must be positive and ring buffer size must be at least 2");
        }
        for(int i = 0; i < size; i++) {
            ringBuffer.add(0.0);
        }
    }
    
    /**
     * Constructs a guitar string and initializes the contents of the ring buffer to the values in the array.
     * @param init, Array of doubles to initialize the ring buffer.
     * @throws IllegalArgumentException if the array has fewer than two elements.
     */
    public GuitarString(double[] init) {
        ringBuffer = new LinkedList<>();
        size = init.length;
        
        if(init.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        for(double item : init) {
            ringBuffer.add(item);
        }
    }

    /**
     * Replaces the N elements in the ring buffer with N random values between -0.5 inclusive and +0.5 exclusive.
     */
    public void pluck() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            ringBuffer.remove();
            ringBuffer.add(random.nextDouble() - 0.5);
        }
    }
    
    /**
     * Applies the Karplus-Strong update once, i.e., deletes the first sample from the ring buffer and adds to the end of the ring buffer the average
     * of the first two samples, scaled by the energy decay factor.
     */
    public void tic() {
        double first = ringBuffer.remove();
        double second = ringBuffer.peek();
        double newSample = (first + second) / 2 * DECAY_FACTOR;
        ringBuffer.add(newSample);
    }
  
    /**
     * Returns the current sample (the value at the front of the ring buffer).
     * @return the current sample.
     */

    public double sample() {
        return ringBuffer.peek();
    }
}