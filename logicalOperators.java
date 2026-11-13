public class logicalOperators {
    public void main(String [] args){
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;


        System.out.println("a && b = "+(a&&b));
        System.out.println("a || b = "+(a||b));
        System.out.println("!(a && b) = "+(!(a&&b)));
        System.out.println("b && c = "+(b&&c));
        System.out.println("a && d = "+(a&&b));
        System.out.println("b || c = "+(b||c));
        System.out.println("a && d = "+(a&&d));
        System.out.println("a || d = "+(a||b));

    }
}
