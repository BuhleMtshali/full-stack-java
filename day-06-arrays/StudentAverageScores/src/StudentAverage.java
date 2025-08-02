import java.util.Scanner;
//import java.util.ArrayList;

public class StudentAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("========= Welcome to My Mini Student Average Checker🍄 ======");
        System.out.println("How to use it: ");
        System.out.println("1. Enter the number of students, you want to calculate their avarage, then, enter ");
        System.out.println("2. Next, enter the final grade for each student, and boom, you'll have your average!!!");

        //starting the while loop
        while (true) {

            System.out.print("How Many student grades do you want to add: ");
            int maxGrade = input.nextInt();

            int[] grades = new int[maxGrade];

            double sum = 0;

            for(int i = 0; i < maxGrade; i++){
                System.out.print("Enter grade for student #" + (i + 1) + ": ");
                grades[i] = input.nextInt();

                for(int grade : grades){
                    System.out.print("Grade for Student #" + (i + 1) + ": " + grade);
                    sum += grade;
                }
            }


            double avarage = sum / grades.length;
            System.out.print("\n===== Thank you for Trying The Grade Checker📇 =====");
            System.out.print("Number of Students: " + grades.length);
            System.out.print("Grade Average: " + avarage + "%");

            input.nextInt();

            //asking if they wanna continue with the loop
            System.out.println("\nWanna run again?");
            String answer = input.nextLine().trim().toLowerCase();

            if(answer.equals("no")){
                System.out.println("\nThank you for trying my mini grade checker");
                break;
            } else {
                System.out.println("\nOkay, lets give it another round!!!");
            }


        }
        


        input.close();
    }
}
