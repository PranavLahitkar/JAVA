package demo1.InheritanceExp;

public class hierarchicalInheritance {
    public void a()
    {
        System.out.println("scddfgtyjhytgbd");
    }
}
class hierarchicalInheritancechild1 extends hierarchicalInheritance{
    public void b()
    {
        System.out.println("dddsds");
    }
}
class hierarchicalInheritancechild2 extends hierarchicalInheritance{
    public void c()
    {
        System.out.println("fgyuyresd");
    }
}
class hierarchicalInheritancechild3 extends hierarchicalInheritancechild1{
    public void d()
    {
        this.a();
        this.b();

        System.out.println("jhfder");
    }
    public static void main(String[] args) {
//        hierarchicalInheritancechild3 h=new hierarchicalInheritancechild3();
//        h.d();
        hierarchicalInheritancechild2 h=new hierarchicalInheritancechild2();
        h.c();
    }
}
