import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("====== 🍄 Welcome to the Mini Area Calculator 🧠 ======");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the shape name (rectangle, triangle, circle): ");
            String shapeName = input.nextLine().toLowerCase();

            double area = 0;

            switch (shapeName) {
                case "rectangle":
                    System.out.print("Enter the length (cm): ");
                    double length = input.nextDouble();
                    System.out.print("Enter the width (cm): ");
                    double width = input.nextDouble();
                    area = length * width;
                    break;

                case "triangle":
                    System.out.print("Enter the base (cm): ");
                    double base = input.nextDouble();
                    System.out.print("Enter the height (cm): ");
                    double height = input.nextDouble();
                    area = 0.5 * base * height;
                    break;

                case "circle":
                    System.out.print("Enter the radius (cm): ");
                    double radius = input.nextDouble();
                    area = Math.PI * radius * radius;
                    break;

                default:
                    System.out.println("⚠️ Unknown shape. Please enter either rectangle, triangle, or circle.");
                    return;
            }

            System.out.printf("✅ The area of the %s is: %.2f cm²\n", shapeName, area);
        }
    }
}
