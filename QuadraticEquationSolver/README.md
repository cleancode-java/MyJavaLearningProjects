# DiscriminantSolverProgramm

A simple Java application for solving quadratic and linear equations using the discriminant method.  
The code is organized into two separate classes: one for the program entry point and one for the mathematical calculations.

---

## Project Structure
DiscriminantSolverProgramm/
│
├── src/
│ ├── Main.java # Program entry point
│ └── DiscriminantSolver.java # Logic for solving equations

---

## How it works

- For a quadratic equation **ax² + bx + c = 0**:
  - Calculates the discriminant (**D = b² - 4ac**)
  - Outputs one or two roots, or a message if no real solutions exist
- Also supports:
  - Linear equations (when `a = 0`)
  - Special cases: infinite solutions or no solutions

---

## How to run

1. Navigate to the `src` folder
2. Compile the code:

javac Main.java DiscriminantSolver.java

Run the program:
   java Main
   
---

## 🧑‍💻 Author

Created by **[cleancode-java](https://github.com/cleancode-java)**  
Year: `2025`  
License: [Apache 2.0](LICENSE)

---

## 📘 License

This project is licensed under the Apache License 2.0.  
See the [LICENSE](LICENSE) file for details.
