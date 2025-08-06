import java.util.Scanner;

class Greeting{

   public void sayHello(){
    System.out.println("Hello there!");
   } 

   public void sayHello(String name){
    System.out.println("Hello " + name);
   }
}


public class MethodOverloading {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        input.close();
    }
}
