## 🔄 Polymorphism in Java

This project demonstrates the concept of polymorphism in Java using two examples:

Compile-time Polymorphism (Method Overloading)

Runtime Polymorphism (Method Overriding)


## 📂 Project Structure

```
.
├── shapeAreaCalculator.java   # Demonstrates Compile-time polymorphism
├── RuntimeShapeCalculator.java # Demonstrates Runtime polymorphism

```

## ⚡ Compile-time Polymorphism (Method Overloading) 

- 📌 File: shapeAreaCalculator.java

 - In this example, the CalculateArea class contains two methods named add.

 - The methods are overloaded: same method name, different number of parameters.

 - The compiler decides which method to call based on the arguments you pass.

```
// Two parameters
public double add(double a, double b) { ... }

// Three parameters
public double add(double a, double b, double c) { ... }

```

- Output Example:

```
Example with 2 parameters: 9.3

Example with 3 parameters: 29.1

```


## ⚡ Runtime Polymorphism (Method Overriding)

📌 File: RuntimeShapeCalculator.java

- The Shape class defines a calculate() method.

- The shapeOne subclass overrides this method with its own implementation.

- At runtime, the JVM decides which version of calculate() to execute, based on the actual object type.

```
Shape shape1 = new Shape();     // Calls Shape's calculate()

Shape shape2 = new shapeOne();  // Calls shapeOne's calculate()

```

- Output Example:

```
original method this is the second method overriding the first method

```


## 🧠 Key Takeaways

- Overloading (Compile-time polymorphism) → Same method name, different signatures.

- Overriding (Runtime polymorphism) → Subclass provides its own implementation of a parent method.

- Polymorphism makes code flexible, reusable, and easier to maintain.


## 🚀 How to Run

Compile both files and run them individually:

```
javac shapeAreaCalculator.java

java shapeAreaCalculator

javac RuntimeShapeCalculator.java

java RuntimeShapeCalculator

```

## 🔮 Future Ideas

Add more shapes (Circle, Rectangle, Triangle) and override an area() method for each.

Combine overloading + overriding in one project.

Use interfaces to explore even deeper polymorphism.