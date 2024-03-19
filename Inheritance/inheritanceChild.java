package demo1.InheritanceExp;

public class inheritanceChild extends inheritance{
    public void b()
    {
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        inheritanceChild i=new inheritanceChild();
        i.a();
        i.b();
    }
}
