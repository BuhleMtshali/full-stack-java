import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("========= 🎓 Welcome to My Mini Student Average Checker 🍄 ======");
        System.out.println("How to use it:");
        System.out.println("1️⃣ Enter how many students’ grades you want to average");
        System.out.println("2️⃣ Enter each student’s final grade");
        System.out.println("3️⃣ Boom 💥 You'll get the average!");

        // Start while loop
        while (true) {
            System.out.print("Enter the name of the module you want to check the avarege for: ");
            String module = input.nextLine();
            System.out.print("\nHow many student grades do you want to add? ");
            int maxGrade = input.nextInt();
            input.nextLine(); // 👈 eat the leftover newline

            int[] grades = new int[maxGrade];
            double sum = 0;

            // 🧮 Collect grades
            for (int i = 0; i < maxGrade; i++) {
                System.out.print("Enter grade for student #" + (i + 1) + ": ");
                grades[i] = input.nextInt();
                sum += grades[i];
            }

            double average = sum / grades.length;

            // 🎉 Show results
            System.out.println("\n===== 📝 Thank you for using the Grade Checker 📇 =====");
            System.out.println("📚Module Name: " + module);
            System.out.println("👥 Number of Students: " + grades.length);
            System.out.printf("📊 Grade Average: %.2f%%\n", average);

            input.nextLine(); // 👈 eat the leftover newline again

            // 🔁 Ask to continue
            System.out.print("\n🔄 Wanna run it again? (yes/no): ");
            String answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("no")) {
                System.out.println("\n👋 Thanks for using the Mini Grade Checker. Bye!");
                break;
            } else {
                System.out.println("\n🎬 Okay! Let's go another round...");
            }
        }

        input.close();
    }
}
