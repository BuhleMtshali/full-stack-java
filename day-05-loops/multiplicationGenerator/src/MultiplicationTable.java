import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("🌟===== Welcome To My Mini Multiplication Calculator 🧮✨ =====");

        while (true) {
            System.out.print("\n🔢 Enter the number for the multiplication table: ");
            int multiplicationNumber = input.nextInt();

            System.out.println("\n📊 Multiplication Table for " + multiplicationNumber + ":");
            for (int i = 1; i <= 11; i++) {
                int result = multiplicationNumber * i;
                System.out.println("➡️ " + multiplicationNumber + " x " + i + " = " + result);
            }

            input.nextLine(); // clear the buffer

            // Ask if they want to continue
            System.out.print("\n❓ Wanna run another table? (yes/no): ");
            String answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("no")) {
                System.out.println("\n🙏 Thank you for using my Mini Multiplication Tracker! ✨\n🚀 Keep multiplying greatness. Byeeee! 👋😎");
                break;
            } else {
                System.out.println("\n🔁 Okayyy let’s run another one! 🎉");
            }
        }

        input.close();
    }
}
