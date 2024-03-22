package demo1.practice;

public class person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        person p=new person();
        p.setName("abc");
        p.setAge(22);
        p.setCountry("pune");
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getCountry());
        p.setName("pqr");
        p.setAge(20);
        p.setCountry("delhi");
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getCountry());
    }
}
