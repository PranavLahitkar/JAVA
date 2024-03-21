package demo1.exceptionhandling;

public class parentClassException {


    public static void main(String[] args) {
        int a=10;
        int b=2;
        int c=0;
        try {
            c = a / b;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("hello");
        }

        System.out.println(c);
    }
}
