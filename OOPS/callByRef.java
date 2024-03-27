class callByRef{  
 int data=50;  
  
 void change(Operation2 op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
   callByRef c=new callByRef();  
  
   System.out.println("before change "+c.data);  
   c.change(c);//passing object  
   System.out.println("after change "+c.data);  
  
 }  
}  

/*Output:before change 50
       after change 150	*/