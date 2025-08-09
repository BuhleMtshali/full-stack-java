import java.util.Scanner;

class Bank{
   double amount = 1000;
   String accountHolder;
   String accountNumber;
   String accountType;
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


        //Storing the user details in variables
        String userName = "";
        String userAccountNumber = "";
        String userAccountType = "";
        String userPin = "";

        
        //START THE WHILE LOOP LOOP FOR VALIDATING USER DETAILS
        while (true) {
            System.out.print("Enter the name you want to register your account with(at least 3 characters): ");
            userName = input.nextLine();

            if(userName.length() >= 3){
                System.out.print("✅ Name captured correctly");
                break;
            } else {
                System.out.println("🚫Invalid input please try again");
            }
            
        }
            //System.out.print("Enter your account number(at least 5-digits): ");
            //userAccountNumber = input.nextLine();

            //System.out.print("Choose an account Type(savings, cheque, credit): ");
            //userAccountType = input.nextLine();

            //System.out.print("Enter PIN (exactly 5 digit): ");
            //userPin = input.nextLine();

            //if(userName.length() > 3 && userAccountNumber.length() >= 5 && userAccountType != null && userPin.length() == 5){
              //  System.out.println("✅ Details entered correctly");
                
            //}
        

        

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
