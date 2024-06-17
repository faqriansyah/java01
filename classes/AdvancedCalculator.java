package classes;

public class AdvancedCalculator {

    private static final String[] OPERATORS = {"+", "-", "*", "/"};
  
    public static void main(String[] args) {
      if (args.length < 3) {
        System.out.println("Usage: java AdvancedCalculator <number1> <operator> <number2>");
        return;
      }
  
      double num1 = Double.parseDouble(args[0]);
      String operator = args[1];
      double num2 = Double.parseDouble(args[2]);
  
      if (!isValidOperator(operator)) {
        System.out.println("Invalid operator. Valid operators: " + String.join(", ", OPERATORS));
        return;
      }
  
      double result = calculate(num1, operator, num2);
      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
  
    private static boolean isValidOperator(String operator) {
      for (String validOperator : OPERATORS) {
        if (validOperator.equals(operator)) {
          return true;
        }
      }
      return false;
    }
  
    private static double calculate(double num1, String operator, double num2) {
      switch (operator) {
        case "+":
          return num1 + num2;
        case "-":
          return num1 - num2;
        case "*":
          return num1 * num2;
        case "/":
          if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero");
          }
          return num1 / num2;
        default:
          throw new IllegalArgumentException("Invalid operator");
      }
    }
  }
  