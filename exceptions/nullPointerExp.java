package demo1.practice;

public class nullPointerExp {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.length());
        }catch (NullPointerException n){
            throw new NullPointerException("abc") ;


        }


    }


}
