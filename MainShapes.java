
public class MainShapes {
    public static void main(String [] args){
        Circle circle1 = new Circle(5);
        System.out.println("Area of the circle is : "+circle1.CalculateArea());

        Triangle triangle1 = new Triangle(6, 7);
        System.out.println("The Area of the triangle is : "+triangle1.CalculateArea());

        Rectangle rectangle1 = new Rectangle(23, 65);
        System.out.println("The Area of the rectangle is : "+rectangle1.CalculateArea());


    }
}
