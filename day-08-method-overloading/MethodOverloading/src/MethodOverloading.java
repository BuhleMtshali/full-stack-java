import java.util.Scanner;

class Greeting{

   public void sayHello(){
    System.out.println("Hello there!");
   } 

   public void sayHello(String name){
    System.out.println("Hello " + name);
   }
   
   public void sayHello(String scannerName, int age){
    System.out.println("Hello " + scannerName + " you are currently " + age + " years old!");
    
   }
}


public class MethodOverloading {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       //creating a new object
       Greeting greet = new Greeting();
       greet.sayHello("Buhle", 23);

        input.close();
    }
}
