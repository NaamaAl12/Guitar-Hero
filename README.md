# 🎸 Guitar Hero Simulation in Java

This project is a **Guitar Hero simulation** implemented in Java using the **Karplus-Strong algorithm** for sound synthesis. It allows users to interactively "pluck" virtual guitar strings using their keyboard, generating realistic guitar sounds.

---

## **Overview**

- **Programming Paradigm**: Object-Oriented Programming (OOP).
- **Main Class**: `GuitarHero.java` (drives the simulation).
- **Guitar Implementations**:
  - `GuitarLite`: Simplified guitar with 2 notes (A and C).
  - `Guitar37`: Full-featured guitar with 37 playable notes.

---

## **Features**

1. **Interactive Guitar Simulation**:
   - Use your **keyboard** to "pluck" strings and play notes in real-time.
   - Supports a full range of 37 notes.

2. **Realistic Sound Synthesis**:
   - Implements the **Karplus-Strong algorithm** to model string vibrations and sound decay.

3. **Custom Keyboard Layout**:
   - Maps standard QWERTY keys to guitar strings:
     ```
     q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' 
     ```

---

## **Requirements**

To run the Guitar Hero simulation, you’ll need:

- **Java Development Kit (JDK)** 8 or higher.
- **StdDraw** and **StdAudio** libraries:
   - These libraries handle keyboard input and audio output.
   - (Include them in your project directory or link to where they can be downloaded.)

---

## **How to Run the Program**

1. **Clone the Repository**:
   Open a terminal and clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
