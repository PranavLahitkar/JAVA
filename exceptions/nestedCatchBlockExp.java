package demo1.exceptionhandling;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class nestedCatchBlockExp {
    int a;
    int b;

    public static void main(String[] args) {
      int c=0;
        int a[]=new int[3];
        a[0]=5;
        a[1]=8;
        a[2]=5;

        try {
             a[1]=30/2;
        }
        catch(ArithmeticException ar) {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException r) {
            System.out.println("Array Exception");
        }
        System.out.println(a[1]);
    }

        }


