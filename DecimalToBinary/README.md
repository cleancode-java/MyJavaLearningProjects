# Decimal to Binary Converter

This is a simple Java console application that converts a **decimal (base-10)** integer to its **binary (base-2)** equivalent.

## Purpose

This project demonstrates:
- Use of **user input** via `Scanner`
- Use of **basic control structures** (`while` loop)
- Use of **string manipulation** with `StringBuilder`
- Modular code with a **custom method** `toBinary(int number)`

It is part of my learning journey with Java.

## How it Works

The user is prompted to enter a decimal number.  
The program calculates the binary equivalent using **repeated division by 2** and builds the result in reverse using `StringBuilder`.

### Example
Enter a decimal number: 10
Binary equivalent: 1010


## Technologies Used

- Java (JDK 21.0.6)
- IntelliJ IDEA

## How to Run

Clone or download this repository.
Open the project in your Java IDE.
Compile and run the DecimalToBinary class.

### Alternatively, from the command line:

javac DecimalToBinary.java

java DecimalToBinary


## File Structure

- `DecimalToBinary.java` – the main class file containing all logic.

## What I Learned

- Working with console input/output in Java
- Converting logic into reusable methods
- Building readable and maintainable beginner-level code
- Structuring a small project on GitHub

## Future Improvements

- Add support for negative integers
- Implement a GUI version
- Add unit tests

---

© 2025 [cleancode-java].  
This project is for educational purposes.
