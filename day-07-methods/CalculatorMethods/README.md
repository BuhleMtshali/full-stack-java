## ☕ Day 7: Modular Java Calculator 👾

Welcome to my Day 7 Java mini project, where I built a Modular Calculator using Java — featuring clean code, switch statements, custom methods, and a user-friendly interface that loops until you’re done calculating like a boss. 🧮🔥


## 🧠 What I Learned

✅ How to create and use methods for modular programming

✅ Mastered switch statements for operator handling

✅ Implemented loops (while) and conditionals

✅ Learned to use Scanner for user input

✅ Practiced error handling, like preventing division by zero

✅ Added ✨aesthetic touches✨ using emojis and friendly prompts


## 💻 How It Works

1. User is greeted with a fun welcome message.

2. Prompted to input:

 - First number

 - Operator (+, -, *, /)

 - Second number

3. Calculator processes the operation using one of the modular methods:

 - add(num1, num2)

 - subtract(num1, num2)

 - multiply(num1, num2)

 - divide(num1, num2) (with division-by-zero check ⚠️)

4. The result is displayed with some 💅🏾 flair.

5. User is asked if they’d like to do another calculation.

6. Loop continues until user types no.


## 🧪 Sample Output

```
==== Welcome to My Modulated Java Calculator👾 ======
Enter your first number: 8
Choose an operator (+, -, *, /): *
Enter your second number: 5
Result: 40.0

Wanna make another calculation? (yes/no): yes

Okay, lets go for another round!!!

```

## 🛠 Tech Stack

- Java 🧃

- VS Code or IntelliJ (your pick)

- Terminal or any Java runtime


## 🗂️ File Structure

```
├── MainCalculator.java   # Main class handling input & logic
├── Calculator.java       # Class with all math method definitions

```

## 📌 Notes

- Keep an eye on .nextLine() vs .next() – had to throw in an extra input.nextLine() to clean the buffer after reading a number!

- Error-handling was important: tried to divide by zero? Nope. 🚫

- The code is clean, readable, and DRY (Don’t Repeat Yourself).


## 🚀 What's Next?
- Add support for more operations like exponents or modulus.

- Wrap it in a GUI using JavaFX or Swing.

- Add input validation (what if someone types a letter instead of a number? 👀).


## 🙌🏾 Credits

Built with pure love, logic, and a little too much caffeine ☕ by Zanobuhle Mtshali.