public class Rectangular_1 extends Shape_1{
    private double length;
    private double width;

    //constructor
    public Rectangular_1(double length,double width){
        this.length = length;
        this.width = width;
    }

    //override method to calculate and return the area
    public double getArea(){
        return length*width;
    }

    
}
