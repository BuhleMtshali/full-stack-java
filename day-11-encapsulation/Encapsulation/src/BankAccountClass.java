class Bank{
    //HIDDEN/PRIVATE VARIABLES
    private String name;
    private String accountNumber;
    private double balance;

    //SETTER METHOD TO CONTROL DATA THAT GOES IN
    public void setName(String newName){
        name = newName;
    }

    public void setAccountNumber(String newAccountNumber){
        if (newAccountNumber.length() > 0){
            accountNumber = newAccountNumber;
        } else {
            System.out.println("🚫Invalid account number!");
        }
    }

    public void setBalance(double newBalance){
        if(newBalance >= 0){
            balance = newBalance;
        } else {
            System.out.println("Invalid balance amount🚫");
        }
    }

    //GETTER METHODS FOR CONTROLLING DATA THAT COMES OUT
    public String getName(){
        return name;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }


}





public class BankAccountClass {
    public static void main(String[] args){
        System.out.println("hello");
    }
}
