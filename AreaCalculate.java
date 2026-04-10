public class AreaCalculate {

    void calculate(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
    void calculate(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    void calculate(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        AreaCalculate obj = new AreaCalculate();

        obj.calculate(4);        
        obj.calculate(4, 5);     
        obj.calculate(2.5);      
    }
} 
