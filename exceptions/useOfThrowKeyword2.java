package demo1.exceptionhandling;

public class useOfThrowKeyword2 {
    public void divide(int a,int b){
        int c=0;
        try {
            c = a / b;
        }
        catch (Exception e){
            throw  new ArithmeticException("you enter the value of b is 0 ");
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        useOfThrowKeyword2 u=new useOfThrowKeyword2();
        u.divide(5,0);
    }
}
