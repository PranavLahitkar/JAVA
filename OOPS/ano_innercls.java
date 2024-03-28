abstract class ano_innercls{  
  abstract void eat();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
  ano_innercls p=new ano_innercls(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }  
}  