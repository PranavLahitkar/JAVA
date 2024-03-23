package demo1.polymorphism;

public class methodOverriding {
    public void addition(int a,int b){
        System.out.println(a+b);
    }

}
class methodOverridind1 extends methodOverriding{
    public void addition(int a,int b){

        System.out.println(a*b);
    }
    public void addition(float a,float b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        methodOverridind1 m=new methodOverridind1();
        m.addition(10.0F,11.0F);
    }
}

