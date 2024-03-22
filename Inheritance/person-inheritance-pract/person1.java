package demo1.practice;

public class person1 {
     private String name;
    private int age;
    person1(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name + " " +age );
    }

    public static void main(String[] args) {
        person1 p=new person1("abc",22);

    }
}
