## 🏦 Bank Account Class (Encapsulation in Java)

## 📌 Project Overview

This project demonstrates Encapsulation in Java by simulating a simple bank account system.
Encapsulation means hiding the internal details of a class (like variables) and controlling access through special methods (getters and setters).


## 📂 Files

- Bank.java → Defines the Bank class with private fields and getter/setter methods.

- BankAccountClass.java → Contains the main method where the program runs.


## 🔑 Key Concepts Used

- Private Variables → Prevents direct access from outside the class (private String name;).

- Setter Methods (setSomething) → Controls what goes into the variables.

    - Example: setBalance(double newBalance) ensures the balance cannot be negative.

- Getter Methods (getSomething) → Controls what comes out of the class safely.

- Encapsulation → Protects the data from invalid input and keeps the class safe.


## 📝 How the Program Works

1. A Bank object is created (Bank bank1 = new Bank();).

2. The program sets values using setters:

    - bank1.setName("Buhle");

    - bank1.setAccountNumber("23457781");

    - bank1.setBalance(234.56);

3. The program retrieves and prints the data using getters:

    - bank1.getName()

    - bank1.getAccountNumber()

    - bank1.getBalance()


## 💻 Sample Output

```
Buhle's account number is 23457781 and her Bank balance is 234.56

```

## 🚀 Why This Matters

- Encapsulation makes your code:

    - ✅ Secure (no one can directly change sensitive data).

    - ✅ Flexible (you decide the rules for input/output).

    - ✅ Reusable (other programs can safely use the class).


## 🧑‍💻 Next Steps

- Add validation for account type (e.g., savings, cheque, credit).

- Add methods to deposit and withdraw money.

- Handle errors with proper messages (e.g., insufficient balance).