class student {
    String name;
    String studentNumber;
    double studentFee;

    //CONSTRUCTOR
    public student(String username, String userNumber, double fee){
        name = username;
        studentNumber = userNumber;
        studentFee = fee;
    }
    
}


public class Constructors {

    public static void main(String[] args){
       student student1 = new student("Buhle", "MTSZAN012", 230);
       System.out.println("Name: " + student1.name);
       System.out.println("Student Number: " + student1.studentNumber);
       System.out.println("Outstanding fee: " + student1.studentFee);
    }
}