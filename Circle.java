public class Circle extends Shape {
    private double radius;

    public Circle(double rad){
        this.radius = rad;
    }

    @Override 
    public double CalculateArea(){
        return Math.PI * radius * radius;
    }
    
}
