// Naama Al-Musawi, CS 145
// Assignment: GuitarHero - (Guita37 class)

// skeleton version of the class

public class Guitar37 implements Guitar {
    public static final String KEYBOARD =
        "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";  // keyboard layout
    private GuitarString[] strings;
    private int time; // To keep track of the number of tics

    /**
     * Constructor that initializes the guitar strings.
     * Each string is tuned to a specific frequency based on its position.
     */
    public Guitar37() {
        strings = new GuitarString[KEYBOARD.length()];
        for (int i = 0; i < KEYBOARD.length(); i++) {
            double frequency = 440.0 * Math.pow(2, (i - 24) / 12.0);
            strings[i] = new GuitarString(frequency);
        }
        time = 0;
    }

    /**
     * Plays the note corresponding to the given pitch.
     * @param pitch, The pitch of the note to play.
     */
    public void playNote(int pitch) {
        int index = pitch + 24;
        if (index >= 0 && index < strings.length) {
            strings[index].pluck();
        }
    }

    /**
     * Checks if the guitar has a string corresponding to the given key.
     * @param key, The key to check.
     * @return true if there is a string for the key, false otherwise.
     */
    public boolean hasString(char key) {
        return KEYBOARD.indexOf(key) != -1;
    }

    /**
     * Plucks the string corresponding to the given key.
     * @param key, The key of the string to pluck.
     * @throws IllegalArgumentException if the key does not correspond to any string.
     */
    public void pluck(char key) {
        int index = KEYBOARD.indexOf(key);
        if (index == -1) {
            throw new IllegalArgumentException("Invalid key: " + key);
        }
        strings[index].pluck();
    }

    /**
     * Returns the sum of the current samples from all strings. 
     * @return the total sample of all strings.
     */
    public double sample() {
        double total = 0.0;
        for (GuitarString string : strings) {
            total += string.sample();
        }
        return total;
    }

    /**
     * Advances the time for all strings by calling tic on each string and increments the time.
     */
    public void tic() {
        for (GuitarString string : strings) {
            string.tic();
        }
        time++;
    }

    /**
     * Returns the current time, represented by the number of tics that have occurred.
     * @return the current time in tics.
     */
    public int time() {
        return time;
    }
}