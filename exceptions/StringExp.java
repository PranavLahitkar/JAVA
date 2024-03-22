package demo1.practice;

public class StringExp {

    public void b( String a){
        if(a.length()>=7){
            System.out.println(a);
        }
        else{
            System.out.println("not found");
        }

    }

    public static void main(String[] args) {
        StringExp s=new StringExp();
        s.b("ashwini");
    }
}
