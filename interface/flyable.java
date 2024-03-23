package demo1.practice;

public interface flyable {
    public void fly_obj();
}
class spacecraft implements flyable{

    @Override
    public void fly_obj() {
        System.out.println("abc");
    }
}
class airplane implements flyable{

    @Override
    public void fly_obj() {
        System.out.println("pqr");
    }
}
class helicopter implements flyable{

    @Override
    public void fly_obj() {

        System.out.println("xyz");
    }

    public static void main(String[] args) {
        helicopter h=new helicopter();
        h.fly_obj();
        h.fly_obj();
    }
}
