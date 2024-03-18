package demo1.exceptionhandling;

public class arrayIndBoundExp {
    public static void main(String[] args) {

        int a[]=new int[3];//define array size
        a[0]=10;
        a[1]=3;
        a[2]=6;
        try {
            a[3] = 7;
        }
        catch (ArrayIndexOutOfBoundsException ar)
        {
            System.out.println(ar);
        }
        System.out.println(a.length);
    }
}
