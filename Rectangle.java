public class Rectangle extends Shape {
    private  double length;
    private  double width;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override 
    public double CalculateArea(){
        return length * width;
    }
    
}
