package demo1.Wrapperclass;

public class autoBoxingExp {
    //first way to convert preemitive datatypes into object
    public static void main(String[] args) {
        int a=6;
        float b=8.8F;
        char d='a';
        Character c=Character.valueOf(d);
        System.out.println(c);
        Float f=Float.valueOf(b);
        System.out.println(f);
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly

        System.out.println(i);
        //second way to convert preemitive datatypes into object
        Integer obj=a;
        System.out.println(obj);
    }
}
