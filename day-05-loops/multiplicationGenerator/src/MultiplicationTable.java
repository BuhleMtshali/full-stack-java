import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("===== Welcome To My Mini Multiplication Calculator🧮 =====");
        
        while (true) {
            System.out.print("Enter the number for the Multiplication table: ");
            int multicationNumber = input.nextInt();

            for(int i = 1; i <= 11; i++){
                int result = multicationNumber * i;
                System.out.println("\nMultiplication for " + multicationNumber + " x " + i + ":");
                System.out.println(result);
            }

            //ask if they want to continue or not
            System.out.print("\nWanna run another table? (yes/no): ");
            String answer = input.nextLine().trim().toLowerCase();

            if(answer.equals("no")){
                System.out.println("Thank you for trying my Mini Multiplication Tracker!");
                break;
            } else {
                System.out.println("\n ---- Lets run another table: ");
            }

        }

            
        input.close();
    }
}
