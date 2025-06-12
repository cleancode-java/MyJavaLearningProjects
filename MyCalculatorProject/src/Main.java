import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = s.nextDouble();
        s.nextLine();

        char operator;
        while (true){
            System.out.println("Enter an operation: +, -, /, *");
            String line = s.nextLine();
            if (line.length() == 1){
                operator = line.charAt(0);
                if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
                    break;
                }
            }
            System.out.println("You entered a symbol other than +, -, /, *. Please enter a valid operator:");
        }
        System.out.println("Enter your second number: ");
        double num2 = s.nextDouble();

        Calculator calculator = new Calculator();

        try {
            double result = calculator.calculate(num1, operator, num2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        s.close();
    }
}
