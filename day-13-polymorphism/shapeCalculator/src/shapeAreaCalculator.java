//COMPILETIME EXAMPLE
class CalculateArea{

    //TWO PARAMETERS
    public double add(double a, double b){
        return a + b;
    }

    //THREE PARAMETERS
    public double add(double a, double b, double c){
        return a + b + c;
    }
}


public class shapeAreaCalculator {
    public static void main(String[] args){
        CalculateArea calc = new CalculateArea();
        System.out.println("Example with 2 parameters: " + calc.add(3.5, 5.8));
        System.out.println("Example with Three parameters: " + calc.add(6.8, 9.9, 12.4));
    }
}
