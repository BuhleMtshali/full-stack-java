class Bank {                         // 👩🏾‍💼 Blueprint (class) for a Bank account

    // HIDDEN/PRIVATE VARIABLES
    private String name;             // 🔒 Account holder's name (private: only this class can touch it)
    private String accountNumber;    // 🔒 Account number (String so leading zeros don't vanish)
    private double balance;          // 🔒 Current balance

    // SETTER METHOD TO CONTROL DATA THAT GOES IN
    public void setName(String newName) {   // ✅ Public method to set the name
        name = newName;                     //    Store the provided value in the private field
    }

    public void setAccountNumber(String newAccountNumber) {     // ✅ Public method to set account number
        if (newAccountNumber.length() > 0) {                    //    Minimal validation: must not be empty
            accountNumber = newAccountNumber;                   //    Save it if valid
        } else {
            System.out.println("🚫Invalid account number!");    //    Feedback if invalid
        }
    }

    public void setBalance(double newBalance) {                 // ✅ Public method to set balance
        if (newBalance >= 0) {                                  //    Rule: balance can't be negative
            balance = newBalance;                               //    Save it if valid
        } else {
            System.out.println("Invalid balance amount🚫");     //    Feedback if invalid
        }
    }

    // GETTER METHODS FOR CONTROLLING DATA THAT COMES OUT
    public String getName() {           // 📤 Public read-access to name
        return name;                    //     Return the private field
    }

    public String getAccountNumber() {  // 📤 Public read-access to account number
        return accountNumber;           //     Return the private field
    }

    public double getBalance() {        // 📤 Public read-access to balance
        return balance;                 //     Return the private field
    }
}

public class BankAccountClass {                             // 🚀 App entry class
    public static void main(String[] args) {                // 🏁 Main method: where the program starts
        Bank bank1 = new Bank();                            // ✨ Create a new Bank object (fields default to null/0.0)

        bank1.setName("Buhle");                             // 📝 Set the account holder's name via setter
        bank1.setAccountNumber("23457781");                 // 📝 Set the account number via setter
        bank1.setBalance(234.56);                           // 💰 Set the starting balance via setter

        System.out.println(                                 // 🖨️ Print a summary line using getters
            bank1.getName() + "'s account number is " +
            bank1.getAccountNumber() + " and her Bank balance is " +
            bank1.getBalance()
        );
    }
}
