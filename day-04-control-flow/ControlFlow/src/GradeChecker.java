import java.util.Scanner;;

public class GradeChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("======= Welcome to My Mini Grade Checker📝 ======");

        System.out.print("Enter Your name: ");
        String name = input.nextLine();

        System.out.print("Enter the name of the module you want to calculate for: ");
        String moduleName = input.nextLine();

        System.out.print("What mark did you get: ");
        int studentMark = input.nextInt();

        System.out.print("What was the test out of: ");
        int testMark = input.nextInt();

        int overallMark = (studentMark / testMark) * 100;

        if (overallMark >= 90){
            System.out.println("Okay " + name + " you got " + studentMark + " in your " + moduleName + " which was out of " + testMark + ", so you got " + overallMark + "%, Congrats, you got an A+");
        }

        input.close();
    }
}
