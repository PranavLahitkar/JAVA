package demo1.exceptionhandling;

public class useOfThrowsKeyword {
    public void odd(int a)throws ArithmeticException{
        if(a%2!=0){

            System.out.println("odd number");

        }
        else{

            System.out.println("not odd number");

        }
    }
    public void divide(int a,int b)throws ArithmeticException{
        int c = 0;
try {
    c = a / b;
}
catch (Exception e){
    System.out.println("adsdfesr");
}
        System.out.println(c);

    }

    public static void main(String[] args) {
        useOfThrowsKeyword t=new useOfThrowsKeyword();
        t.odd(6);
        t.divide(8,9);
    }
}
