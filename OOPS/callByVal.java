class callByVal{  
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
   callByVal c=new callByVal();  
  
   System.out.println("before change "+c.data);  
   c.change(500);  
   System.out.println("after change "+c.data);  
  
 }  
}  

/*Output:before change 50
       after change 50	*/