package demo1.practice;

public class odd {
    public void aa(int a) throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException{

        if(a%2 !=0) {
            System.out.println("not odd");
        }
        else {
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        odd o=new odd();
        o.aa(5);
    }
}
