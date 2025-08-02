import java.util.Scanner;
//import java.util.ArrayList;

public class StudentAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("========= Welcome to My Mini Student Average Checker🍄 ======");

        //starting the while loop
        System.out.print("How Many student grades do you want to add: ");
        int maxGrade = input.nextInt();

        int[] grades = new int[maxGrade];

        for(int i = 0; i < maxGrade; i++){
            System.out.print("Enter grade for student #" + (i + 1) + ":");
            grades[i] = input.nextInt();
        }

        System.out.println("\nHere are the grades you entered: ");
        for(int grade : grades){
            System.out.println("Grade:" + grade);
        }


        input.close();
    }
}
