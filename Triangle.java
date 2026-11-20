public class Triangle extends Shape {
    private  double base;
    private  double height;

    public Triangle (double b, double h){
        this.base = b;
        this.height = h;
    }

    @Override 
    public double CalculateArea(){
        return 0.5 * base * height;
    }

    
}
