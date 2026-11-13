// works like tenary operator

public class miscOperator {
    public void main(String [] args){
        int a,b;
        a = 10;

        b = (a==1)?20:30;  //if the condition is false it takes the second number
        System.out.println("The value of b is: "+b);

        b = (a==10)?20:30;
        System.out.println("The value of b is: "+b);
    }
    
}
