## 🏦 Bank Account Type Selector

This is a simple Java console program where the user chooses their bank account type from three valid options:
savings, cheque, or credit.

## The program:

- Prompts the user to enter their account type.

- Accepts input in any mix of uppercase or lowercase letters.

- Validates the choice — only one of the three valid options is allowed.

- Gives a confirmation message if the input is valid.

- Shows an error message if the input is invalid.


## 💻 How It Works

1. The program stores the user’s input in a variable.

2. It uses the .equalsIgnoreCase() method to compare input against valid options.

3. If the user types:

    - ✅ Valid input → Displays Account type captured: [type]

    - 🚫 Invalid input → Displays Invalid account type entered.


## 🛠️ Example Run

```
Enter your account type: savings

Account type captured: savings

```

```
Enter your account type: Gold

Invalid account type entered.

```


## 🧠 What You’ll Learn

- Using Scanner to capture user input.

- String comparison with .equalsIgnoreCase().

- Basic input validation logic in Java.


## 📌 Next Steps / Improvements

- Add a loop so the user can keep trying until they enter a valid type.

- Add more account types dynamically using an array or List.

- Combine with PIN validation for a full bank login simulation.