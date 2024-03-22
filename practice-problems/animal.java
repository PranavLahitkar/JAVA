package demo1.practice;

public class animal {
    public void sound(String name){
        System.out.println("abc");
    }
}
class bird extends animal{
    public void sound(String a,String b){
//        this.sound();
        System.out.println("chirps");
    }
}
class cat extends bird{
    public void sound(){
//        this.sound();
//        super.sound();
        System.out.println("meow meow");
    }

    public static void main(String[] args) {
        cat c=new cat();
//        bird b=new bird();
//        b.sound();
        c.sound();
        c.sound("gff");
        c.sound("gfd","gfd");
    }

}
