## 🧠 Day 8 – Practicing Method Overloading in Java


## 📌 Project Title: 

Greeting Overload: Say Hello in Many Ways!


## 📋 Description:

This project explores the concept of method overloading in Java by creating a simple class called Greeting that provides multiple versions of a sayHello() method. Each method varies by the number and type of parameters, showing how the same method name can be reused for different scenarios.


## 🛠️ What I Learned:

- How method overloading works in Java

- How to define multiple methods with the same name but different parameters

- The difference between static and non-static methods

- How to create and use objects to call class methods


## 🔑 Key Concepts Practiced:

| Concept             | Description                                                                       |
| ------------------- | --------------------------------------------------------------------------------- |
| Method Overloading  | Same method name, different parameters (number/type/order)                        |
| Class Instantiation | Created an object using `new Greeting()`                                          |
| Non-static methods  | Used an object to access instance methods                                         |
| Scanner             | Set up for potential user input (not used here, but imported and closed properly) |


## 💡 Code Summary:

```

// Overloaded methods
sayHello();                         // → "Hello there!"
sayHello("Buhle");                  // → "Hello Buhle"
sayHello("Buhle", 23);              // → "Hello Buhle you are currently 23 years old!"

```

- Each method call triggers a different version of sayHello() based on the arguments passed. Pure polymorphism vibes 🎭✨


## 🔄 Possible Improvements:

- Accept user input via Scanner to dynamically call different versions of sayHello().

- Add a fourth overloaded method using a different parameter order (e.g. sayHello(int age, String name)).

- Convert methods to static and test calling them without object instantiation.



## 🎯 Goal for Tomorrow (Day 9):
- Explore method overriding and the concept of inheritance. 

- Extend the Greeting class and override sayHello() in a subclass. 👩🏽‍💻🐣

