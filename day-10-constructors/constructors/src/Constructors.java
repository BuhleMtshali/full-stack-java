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
       System.out.println(student1.name);
    }
}