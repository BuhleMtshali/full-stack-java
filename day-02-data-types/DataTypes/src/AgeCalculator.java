import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args){
        System.out.println("------- 👾 Welcome to My Mini Age Calculator 🧑🏼‍🎤 -------");

        // ✅ Use try-with-resources to auto-close Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // ✨ Get user's name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // 🎂 Ask for birth details
            System.out.print("Enter your birth year (e.g., 2000): ");
            int birthYear = scanner.nextInt();

            System.out.print("Enter your birth month (1-12): ");
            int birthMonth = scanner.nextInt();

            System.out.print("Enter your birth day (1-31): ");
            int birthDay = scanner.nextInt();

            // 🧾 Create birthdate & current date
            LocalDate birthDate;
            try {
                birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
            } catch (Exception e) {
                System.out.println("⚠️ Hmm... that date looks off. Try again maybe?");
                return;
            }

            LocalDate currentDate = LocalDate.now();

            // 💡 Calculate age
            if (birthDate.isAfter(currentDate)) {
                System.out.println("⚠️ Are you from the future? 🛸 Time travel isn't legal yet!");
            } else {
                Period age = Period.between(birthDate, currentDate);
                System.out.println("Hi " + name + " 🧑🏼‍🎤!");
                System.out.println("You are: " +
                        age.getYears() + " years, " +
                        age.getMonths() + " months, and " +
                        age.getDays() + " days old 🎉✨");
            }
        }
    }
}
