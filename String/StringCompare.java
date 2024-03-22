package demo1.string;

public class StringCompare {
    public static void main(String[] args) {
        String a="java";
        String b="java";
        if(a==b)//compare address
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if (a.equals(b))//dot equal method compare value
        {
            System.out.println("String are equals");
        }
        else{
            System.out.println(" not equals");
        }
        String temp=new String("java");
        String temp1=new String("java");
        if(temp==temp1){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
      if (temp.equals(temp1)){
          System.out.println("equal");
      }else
      {
          System.out.println("not equal");
      }
    }
}
