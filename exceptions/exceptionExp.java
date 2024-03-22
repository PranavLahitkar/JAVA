package demo1.practice;

public class exceptionExp {
    public static void main(String[] args) {
        int b=0;
        int a[]=new int[4];
        a[0]=1;
        a[1]=6;
        a[2]=9;
        a[3]=13;
        try {
            b = a[3] / 0;
        }
        catch (ArithmeticException ar){
            System.out.println("abc");
        }
        System.out.println(b);
    }
}
