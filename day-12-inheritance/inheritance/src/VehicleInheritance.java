//PARENT CLASS (SUPER CLASS)
class Vehicle{
    String name;
    String model;

    public void drive(){
        System.out.println("You drive a " + name + " which is a " + model + " vehicle");
    }
}

//CHILD CLASS (SUB CLASS) INHERITS FROM VEHICLE
class miniVehicle extends Vehicle{
    public void car(){
        System.out.println("Helo mini you, you drive a " + name + " which is a " + model + " model");
    }
}


public class VehicleInheritance {
    public static void main(String[] args){
        miniVehicle mini = new miniVehicle();
        mini.name = "Toyota";
        mini.model = "2021";
        mini.car();
    }
}
