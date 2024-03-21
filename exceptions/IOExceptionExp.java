package demo1.exceptionhandling;

import java.util.Scanner;

public class IOExceptionExp extends Throwable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a ");
       try{
           int a=sc.nextInt();
       }
       catch (Exception r)
       {
           System.out.println(r);
       }
    }
}
