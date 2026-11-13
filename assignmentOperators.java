public class assignmentOperators {
    public void main(String [] args){
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " +c);

        c+=a;
        //c = c + a;
        System.out.println("c += a  = " +c);


        c-=a;
        System.out.println("c -= a  = " +c);

        c*=a;
        System.out.println("c *= a  = " +c);

        //reset the value a to 10 and divide c by a
        a = 10; b = 15; c/=a;

        System.out.println("c/=a = "+c);


        //reset the value of a to 10 and use modulus operator to find the remainder of c divided by a
        a = 10; c = 15; c%=a;

        System.out.println("c%=a = " +c);





    }
}
