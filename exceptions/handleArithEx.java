package demo1.exceptionhandling;

import java.security.PublicKey;
import java.util.Scanner;

public class handleArithEx {
    int a;
    int b;
    

    public static void main(String[] args) {
        int c = 0;
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        try {
             c = a / b;
        }
        catch(ArithmeticException ar)
        {
            System.out.println("you enter the value of b variable is 0...." +ar);
        }
        System.out.println(c);
        System.out.println("hello");
    }
}
