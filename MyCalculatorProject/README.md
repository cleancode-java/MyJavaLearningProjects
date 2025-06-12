# Simple Java Calculator

This is a simple Java console calculator project that performs basic arithmetic operations.

## Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`) with division-by-zero validation
- Input validation for allowed operators
- Exception handling

## Project Structure
src/
├── Main.java // Contains the main method and user input handling
└── Calculator.java // Contains the core calculation logic

##  How to Run

1. Clone this repository:

```bash
git clone https://github.com/cleancode-java/MyJavaLearningProjects/MyCalculatorProject.git
cd MyCalculatorProject
Open the src folder in your IDE (like IntelliJ IDEA).
Run Main.java.

 Example
Enter a number: 
10
Enter an operation: +, -, /, *
*
Enter your second number: 
5
Result: 50.0

Notes
If a non-supported operator is entered, the program will ask again.

If division by zero is attempted, a custom exception message is shown.

### License
This project is licensed under the MIT License. Feel free to use and modify it for educational purposes.
