package demo1.practice;

public class person3 {
    public void getFirstName(){
        System.out.println("Ashwini");
    }
    public void getLastName(){
        System.out.println("Bachhav");
    }
}
class Employee1 extends person3{
    public void getEmployeeId(int a){
        System.out.println(1);
    }
    public void getLastName(){
        System.out.println("bachhav");
    }

    public static void main(String[] args) {
        Employee1 e=new Employee1();
        e.getFirstName();
        e.getLastName();
        e.getEmployeeId(1);
    }
}
