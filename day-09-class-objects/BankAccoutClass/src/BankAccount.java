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

   public void transfer( String recipientAccountHolder, String recipientAccountNumber, double recipientTranferValue ){
        if (this.amount > recipientTranferValue){
            this.amount -= recipientTranferValue;
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

        //1. Validating username
        while (true) {
            System.out.print("\nEnter the name you want to register your account with(at least 3 characters): ");
            userName = input.nextLine();

            if(userName.length() >= 3){
                System.out.println("\n✅ Name captured correctly");
                break;
            } else {
                System.out.println("\n🚫Invalid input, name has to be more than 3-characters please try again");
            }
            
        }

        //validating account number
        while (true) {
            System.out.print("\nEnter your account number (at least 5-digits): ");
            userAccountNumber = input.nextLine();

            if(userAccountNumber.length() >= 5){
                System.out.println("\n✅ Account number captured correctly");
                break;
            } else {
                System.out.println("\n🚫Invalid input, pleas make sure the acount number is atleast 5-digits and only includes numbers");
            }

        }


        //VALIDATING ACCOUNT TYPE
        while (true) {
            System.out.print("\nChoose an account Type(savings, cheque, credit): ");
            userAccountType = input.nextLine().trim().toLowerCase();

            if(userAccountType.equals("savings") || userAccountType.equals("cheque") || userAccountType.equals("credit")){
                System.out.println("\n✅ Account Type number captured correctly");
                break;
            } else {
                System.out.println("🚫Invalid, please make sure you input account type correctly");
            }
        }

        //VALIDATING THE PIN
        while (true) {
            System.out.print("\nEnter PIN (exactly 5 digit): ");
            userPin = input.nextLine();

            if(userPin.trim().length() == 5 && userPin.matches("\\d{5}")){
                System.out.println("\n✅ Account Pin number captured correctly");
                break;
            } else {
                System.out.println("\n🚫Pin has to be 5-digits");
            }
        }

        System.out.println("\n----------- 👾Bank Account Details🏧 ---------");
        System.out.println("\nName: " + userName);
        System.out.println("\nAccount: " + userAccountNumber);
        System.out.println("\nAccount Type: " + userAccountType);
        System.out.println("\nPin: " + userPin + " (remember to keep this private!!!)");
        System.out.println("\n---------------- END OF ACCOUNT DETAILS --------------");


        //STARTING THE WHILE LOOP FOR THE MAIN LOOP
        while (true) {
            System.out.println("\n======== 🛜 Please Select an option below to start your transaction📲 ========");

            //theese are our options
            System.out.println("\n1. Deposit 💵");
            System.out.println("\n2. Withdraw ➖");
            System.out.println("\n3. View Balance 📝");
            System.out.println("\n4. Transfer Money ");
            System.out.println("\n5. Pay Bills 📨");

            String option = input.nextLine();

            //starting the switch statement
            switch (option) {

                //CASE 1 FOR DEPOSIT
                case "1":
                    System.out.print("Enter the amount you want to deposit (R): ");
                    double depositAmount = input.nextDouble();
                    if(depositAmount > 0){
                        bankActions.deposit(depositAmount);
                        System.out.println("✅ transaction was successful, new balance is R" + bankActions.amount);
                    } else {
                        System.out.println("🚫 Invalid amount, please try again");
                    }
                    break;

                //CASE 2 WITHDRAAW
                case "2":
                    System.out.print("Enter the amount you want to withdraw (R): ");
                    double withdrawAmount = input.nextDouble();
                    if(withdrawAmount > 0 && withdrawAmount < bankActions.amount){
                        bankActions.withdraw(withdrawAmount);
                        System.out.println("✅ transaction was successful, new balance is R" + bankActions.amount);
                    } else {
                        System.out.println("🚫 Invalid amount, please try again");
                    }
                    break;

                //CASE 3 VIEW BALANCE
                case "3":
                    bankActions.balance(bankActions.amount);   
                    System.out.println("Current Balance: R" + bankActions.amount); 
                    break;
                
                //TRANSFER MONEY
                case "4":
                    System.out.print("Enter the Recipient Name: ");
                    String recipientName = input.nextLine();
                    System.out.print("Enter the Receipent's Account Number: ");
                    String recientAccountNumber = input.nextLine();
                    System.out.print("Enter the amount to send: ");
                    double recipientAmount = input.nextDouble();
                    if(recipientAmount < bankActions.amount){
                         bankActions.transfer(recipientName, recientAccountNumber, recipientAmount);
                         System.out.println("\n======== 📝 Proof of Payment =======");
                        System.out.println("\n=== Recepient Name: " + recipientName + " =======");
                        System.out.println("\n===== Receipient Account Number: " + recientAccountNumber + " ======");
                        System.out.println("\n==== Amount Sent R: " + recipientAmount + " =====");
                        System.out.println("\n===== Account Balance R: " + bankActions.amount);
                        System.out.println("\n---------------------END----------------------");
                    } else {
                        System.out.println("🚫 Invalid amount, please try again");
                    }
                   
                    break;

                //PAYING BLLS
                case "5":
                    System.out.print("Enter your bill entity name: ");
                    String billName = input.nextLine();
                    System.out.print("Enter your reference number: ");
                    String referenceNumber = input.nextLine();
                    System.out.print("Enter the amount you want to pay: ");
                    double paymentAmount = input.nextDouble();
                    if(paymentAmount < bankActions.amount){
                        bankActions.transfer(billName, referenceNumber, paymentAmount);
                        System.out.println("\n======== 📝 Proof of Payment =======");
                        System.out.println("\n=== Bill Name: " + billName + " =======");
                        System.out.println("\n===== Bill Reference Number: " + referenceNumber + " ======");
                        System.out.println("\n==== Amount Sent R: " + paymentAmount + " =====");
                        System.out.println("\n===== Account Balance R: " + bankActions.amount);
                        System.out.println("\n---------------------END----------------------");
                    } else {
                        System.out.println("🚫 Invalid amount, please try again");
                    }
                    break;

                default:
                    System.out.println("🚫Invalid input, please try again");
                    break;
            }

            input.nextLine();
            //starting to close the while loop
            System.out.print("\nWanna make another transaction❓");
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
