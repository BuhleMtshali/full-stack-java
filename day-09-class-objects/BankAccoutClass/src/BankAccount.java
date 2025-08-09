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
    }
   }

   public void payBills(String billName, String billAccountNumber, double billAmount){
    if (this.amount > 0 && this.amount > billAmount){
        this.amount -= billAmount;
    }
   }
}

public class BankAccount {
    public static void main(String[] args){
        System.out.println("hello ");
    }
}
