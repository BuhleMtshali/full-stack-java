## 🚗 Vehicle Inheritance Project


## 📌 Overview


This project demonstrates the Object-Oriented Programming (OOP) principle of Inheritance in Java.

Inheritance allows one class (child/subclass) to reuse the properties and methods of another class (parent/superclass) while still being able to add its own unique features.

In this example:

- A Vehicle class (parent) contains shared attributes and methods.

- A miniVehicle class (child) inherits from Vehicle and extends its functionality.


## 🏗️ Project Structure

```
// PARENT CLASS (SUPERCLASS)
class Vehicle {
    String name;
    String model;

    public void drive() {
        System.out.println("You drive a " + name + " which is a " + model + " vehicle");
    }
}

// CHILD CLASS (SUBCLASS) inherits from Vehicle
class miniVehicle extends Vehicle {
    public void car() {
        System.out.println("Hello mini you, you drive a " + name + " which is a " + model + " model");
    }
}

// RUNNER CLASS (main method)
public class VehicleInheritance {
    public static void main(String[] args) {
        miniVehicle mini = new miniVehicle();
        mini.name = "Toyota";
        mini.model = "2021";
        mini.car();
    }
}

```

## 🔑 Key Concepts


1. Superclass (Parent Class):

    - Vehicle holds common attributes (name, model) and methods (drive).

    - Think of it as the "template" for all vehicles.

2. Subclass (Child Class):

    - miniVehicle extends Vehicle.

    - It automatically inherits the fields and methods of Vehicle.

    - It can also define new methods (car) specific to itself.

3. extends keyword:

    - Used by the child class to inherit from the parent class.

4. Code Reusability:

    - Instead of rewriting the name and model logic, the subclass borrows it directly from the parent class.

## ▶️ Example Output

```
Hello mini you, you drive a Toyota which is a 2021 model

```

## 💡 Why This Matters

- Inheritance reduces code duplication.

- Helps create organized, scalable, and reusable code.

- Real-world use cases:

    - User → Admin, Customer (roles system)

    - Shape → Circle, Square, Triangle (graphics apps)

    - Vehicle → Car, Bike, Truck (simulation systems)


## 🚀 How to Run

1. Save the code in a file called VehicleInheritance.java.

2. Compile the program:

```
javac VehicleInheritance.java

```

3. Run the program:

```
java VehicleInheritance

```