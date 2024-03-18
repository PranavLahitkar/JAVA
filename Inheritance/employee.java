package demo1.practice;

public class employee {
    String name;
    int salary;
    String address;

    public employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    public void display(){
        System.out.println(name + " " + salary + " " +  address);
    }
}
class manager extends employee{

    public manager(String name, int salary, String address) {
        super(name, salary, address);
    }
}
class developer extends employee{

    public developer(String name, int salary, String address) {
        super(name, salary, address);
    }
}
class programmer extends employee {

    public programmer(String name, int salary, String address) {
        super(name, salary, address);
    }

    public static void main(String[] args) {
        programmer p=new programmer("abc",25000,"pune");
        p.display();
    }
}

