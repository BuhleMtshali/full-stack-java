import java.util.Scanner;

class Calculator{

    public static double add(double num1, double num2){
        return num1 + num2;
    };

    public static double subtract(double num1, double num2){
        return num1 - num2;
    };

    public static double multiply(double num1, double num2){
        return num1 * num2;
    };

    public static double divide(double num1, double num2){
        if (num1 == 0){
            System.out.println("🚫ERROR: Division by zero is not allowed");
            return Double.NaN; //this is an error indicator for not a number
        } else {
            return num1 / num2;

        }
    }
}

public class MainCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("==== Welcome to My Modulated Java Calculator👾 ======");

        System.out.print("Enter your first number: ");
        double numberOne = input.nextDouble();

        System.out.print("Choose an operator (+, -, *, /)");
        char operator = input.next().charAt(0);

        System.out.print("Enter your second number: ");
        double numberTwo = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = Calculator.add(numberOne, numberTwo);
                break;
            case '-':
                result = Calculator.subtract(numberOne, numberTwo);
                break;
            case '*':
                result = Calculator.multiply(numberOne, numberTwo);
                break;
            case '/':
                result = Calculator.divide(numberOne, numberTwo);
                break;
            default:
                System.out.println("Invalid operator");
                return;
                
        }

        System.out.println("Result: " + result);
        input.close();
    }
}