// methodOverloading is when two function functions have the same name but different mathods

public class methodOverloading {
    public static void main(String [] args){
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;

        int one = minFunction(a, b);
        double  two = minFunction(c,d);

        System.out.println("Min for int : "+one);
        System.out.println("Min for double : "+two);

    }

    public static int minFunction(int n, int m){
        int min;
        if (n>m){
            min = m;
        }
        else {
            min = n;
        }
        return min;
    }
    

    public static double minFunction(double x, double y){
        double min;
        if (x>y){
            min = y;
        }
        else {
            min = x;
        }
        return min;
    }
}
