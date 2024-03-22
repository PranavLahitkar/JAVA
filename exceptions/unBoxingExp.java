package demo1.Wrapperclass;

public class unBoxingExp {
    public static void main(String[] args) {


        int a = 8;
        Integer i = Integer.valueOf(a);
        System.out.println(i);
        //first way to convert object into preemitive
        int b=i.intValue();
        System.out.println(b);
        //second way to convert object into preemitive
        int aaaaaaa=i;
        System.out.println(aaaaaaa);
    }
}
