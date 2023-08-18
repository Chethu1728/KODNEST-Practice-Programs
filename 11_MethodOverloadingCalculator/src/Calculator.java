import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
           System.out.println("Cannot divide by zero");
        }
        return num1 / num2;
    }
}


