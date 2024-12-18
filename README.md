# 🎸 Guitar Hero Simulation in Java

This project is a **Guitar Hero simulation** implemented in Java using the **Karplus-Strong algorithm** for realistic sound synthesis. It allows users to interactively "pluck" virtual guitar strings using their **keyboard**.

---

## **Overview**

- **Programming Paradigm**: Object-Oriented Programming (OOP).
- **Main Class**: `GuitarHero.java` (drives the simulation).
- **Guitar Implementations**:
  - `GuitarLite`: Simplified guitar with 2 strings (A and C notes).
  - `Guitar37`: Full-featured 37-string guitar mapped to the keyboard.

The program simulates guitar sounds using a **ring buffer** to model string vibrations and decay over time.

---

## **Features**
1. **Interactive Guitar Simulation**:
   - Use your keyboard to "pluck" strings and play notes in real-time.
   - Each key corresponds to a different frequency (note).

2. **Realistic Sound Decay**:
   - Implements the **Karplus-Strong algorithm** to simulate string vibrations and sound decay.

3. **Full Keyboard Support**:
   - Supports 37 keys on a standard QWERTY keyboard:
     ```
     q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' 
     ```

4. **Simplified & Advanced Modes**:
   - `GuitarLite`: Two playable notes (A and C).
   - `Guitar37`: Full guitar implementation with 37 notes.

---

## **How It Works**

### 🎯 **Keyboard Mapping**
- Each key on the keyboard corresponds to a guitar string tuned to a specific frequency.
- Example:
   - **`q`** = Lowest note.
   - **`space` (spacebar)** = Highest note.

### 🛠 **Karplus-Strong Algorithm**
- The algorithm simulates the sound of a plucked string:
  - A ring buffer is filled with random noise to simulate "plucking."
  - The buffer is updated over time to produce realistic sound decay.

---

## **Classes**
### 📜 **Main Class**
- `GuitarHero.java`: Drives the program, captures user input, and outputs sound.

### 🎻 **Helper Classes**
- `GuitarString.java`:
   - Models a vibrating string using a **ring buffer**.
   - Implements the Karplus-Strong update for realistic sound.
- `GuitarLite.java`:
   - Simplified guitar with **two strings**.
   - Supports A and C notes.
- `Guitar37.java`:
   - Advanced guitar with **37 strings** mapped to keyboard keys.
   - Allows playing a wide range of notes.

### 🎸 **Interface**
- `Guitar.java`: Specifies the methods required for any guitar implementation.

---

## **How to Run**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
