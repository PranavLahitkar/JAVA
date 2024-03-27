class clonningObject implements Cloneable{  
int rollno;  
String name;  
  
clonningObject(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
clonningObject s1=new clonningObject(101,"amit");  
  
clonningObject s2=(clonningObject)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  