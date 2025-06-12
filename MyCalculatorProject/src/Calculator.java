public class Calculator {
    public double calculate (double num1, char operator, double num2){
        double result;

        if (operator == '+'){
            result = num1 + num2;
        } else if (operator == '-'){
            result = num1 - num2;
        } else  if (operator == '*'){
            result = num1 * num2;
        } else if (operator == '/'){
            if (num2 == 0) {
                throw new IllegalArgumentException("Error: divition by zero");
            }
            result = num1 / num2;
        } else {
            throw new IllegalArgumentException("Unknowm operation!");
        }
        return result;
    }
}
