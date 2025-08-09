import java.util.Scanner;

class Bank{
   double amount = 1000;
   String accountHolder;
   String accountNumber;
   String pin;

   public void deposit(double addValue){
    this.amount += addValue; 
   }

   public void withdraw(double withdrawValue){
    this.amount -= withdrawValue;
   }

   public void balance(double viewBalance){
    this.amount = viewBalance;
   }

   public void transfer( String recipientName, String accountNumber, double tranferValue ){
    if (this.amount > 0 && this.amount < tranferValue && accountNumber.length() >= 5){
        this.amount -= tranferValue;
    } else {
        System.out.println("🚫Insufficient funds to complete the Transaction");
    }
   }

   public void payBills(String billName, String billAccountNumber, double billAmount){
    if (this.amount > 0 && this.amount > billAmount){
        this.amount -= billAmount;
    } else {
        System.out.println("🚫Insufficient funds to complete the Transaction");
    }
   }
}

public class BankAccount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //creating a new object
        Bank bankActions = new Bank();

        //welcome message
        System.out.println("\n======= Welcome to JavaBank🏧 =======");
        System.out.println("\nLet's get your details first!");


        //get the user details
        System.out.print("Enter ");

        

        //STARTING THE WHILE LOOP
        while (true) {

            //theese are our options
            System.out.println("1. View Account");



            //starting to close the while loop
            System.out.print("\nWhanna make another transaction❓");
            String answer = input.nextLine();
            if(answer.equals("no")){
                System.out.println("\nThank your for banking we us👾!!");
                break;
            } else {
                System.out.println("----- Lets do another transaction🛜 -----");
            }
        }

        input.close();
    }
}
