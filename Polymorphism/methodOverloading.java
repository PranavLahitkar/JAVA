package demo1.polymorphism;

public class methodOverloading {
    public  void addition(int a,int b){
        System.out.println(a+b);

    }
//    public void addition(int a,int b,int c){
//        System.out.println(a+b+c);
//    }
  public void addition(String a,String b) {
      System.out.println(a + b );
  }
    public static void main(String[] args) {
        methodOverloading m=new methodOverloading();
        m.addition(5,8);
        m.addition("gfhgf","yyuiugg");
    }
}
