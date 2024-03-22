package demo1.userInput;

import java.util.Scanner;

public class stringConcat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string : ");
        String a=sc.next();
        System.out.println(a);
        System.out.println("enter second string : ");
        String  b=sc.next();
        System.out.println(b);
        String c=a + b;
        System.out.println(c);
    }
}
