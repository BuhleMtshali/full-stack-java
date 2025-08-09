import java.util.Scanner;

class Bank{
   double amount = 1000;

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
    if (amount > 0 && accountNumber.length() >= 5){
        this.amount -= tranferValue;
    }
   }
}

public class BankAccount {
    public static void main(String[] args){
        System.out.println("hello ");
    }
}
