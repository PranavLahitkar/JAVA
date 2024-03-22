package demo1.userInput;

import java.util.Scanner;

public class InputStringFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a first value : "); //Accept the integer value from the user
//        int a = sc.nextInt();
//        System.out.println("enter second value : ");
//        int b = sc.nextInt();
//        int c = a + b;
//        System.out.println(c);

        //Accept the String from the User
//        System.out.println("enter a string : ");
//        String a=sc.next();
//        System.out.println(a);

        //Accept the Single character from the user
       System.out.println("Enter the character : ");
        String a=sc.next();
        char b=a.charAt(4);
        System.out.println(b);

        //Acccept the whole string from the user
//        System.out.println("enter a string : ");
//       String a=sc.nextLine();
//        System.out.println(a);

   }
}
