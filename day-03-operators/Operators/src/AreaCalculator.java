import java.util.Scanner;;

public class AreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("====== Welcome To Mini Area Calculator🍄 =======");

        System.out.print("Enter the name of the shape we are trying calculate: ");
        String shapeName = input.nextLine();

        System.out.print("Enter the length (cm): ");
        Double length = input.nextDouble();

        System.out.print("Enter the width (cm): ");
        Double width = input.nextDouble();

        Double areaTotal = length * width;

        System.out.print("The Area of the " + shapeName + " is: " + areaTotal + "cm");

        input.close();
    }
}
