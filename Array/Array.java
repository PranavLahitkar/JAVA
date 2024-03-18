package demo1.practice;

public class Array{
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 7;
        a[2] = 9;
        try {
            a[3] = 6;
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("array");
        }
        System.out.println(a.length);
    }
}




