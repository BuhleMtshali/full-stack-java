class Shape{
    public void calculate(){
        System.out.println("original method");
    }
}

class shapeOne extends Shape{
    public void calculate(){
        System.out.println("this is the second method overiding the first method");
    }
}

public class RuntimeShapeCalculator {
    public static void main(String[] args){
        System.out.println("hello");
    }
}
