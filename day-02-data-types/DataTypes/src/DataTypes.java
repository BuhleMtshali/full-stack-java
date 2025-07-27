import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Double output;

        System.out.println("------ Welcome To My First Mini Calculator🍀 -------");
        System.out.print("Enter your first Number: ");
        Double firstNumber = input.nextDouble();
        System.out.print("Choose an operator(+, -, *, x): ");
        char operator = input.next().charAt(0);
        System.out.print("Enter your second number: ");
        Double secondNumber = input.nextDouble();

        switch (operator) {
            case '+':
                output = firstNumber + secondNumber;
                System.out.println("Result: " + output);
                break;
            case '-':
                output = firstNumber - secondNumber;
                System.out.println("Result: " + output);
                break;
            case '/':
                if (secondNumber != 0){
                    output = firstNumber / secondNumber;
                    System.out.println("Result: " + output);
                } else {
                    System.out.println("We cannot devide by 0");
                }
                break;
            case '*':
                output = firstNumber * secondNumber;
                System.out.println("Result: " + output);
                break;
            default:
                System.out.println("❌ Invalid operator!");
                break;
        }

        

        input.close();
    }
}
