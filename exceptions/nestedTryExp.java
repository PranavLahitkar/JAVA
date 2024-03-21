package demo1.exceptionhandling;

public class nestedTryExp {
    public static void main(String[] args) {
        try {

            try {
                int a = 30 / 0;
            } catch (Exception e) {
                System.out.println("Arithmetic exception");
            }

            try {
                int a[] = new int[3];
                a[4] = 10;
            } catch (Exception e1) {
                System.out.println("Array exception");
            }
        } catch (Exception e2) {
            System.out.println("handle the exception");
        }

        System.out.println("normal flow");
    }
}
