import java.util.Scanner;

public class Calculator{

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

        input.close();
    }
}