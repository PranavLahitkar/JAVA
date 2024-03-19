package demo1.practice;

public class array2 {
    public static void main(String[] args) {
        array1 a=new array1(1,"abc","pune");
        array1 aa=new array1(2,"pqr","nashik");
        array1 ar=new array1(3,"xyz","dhule");
        array1 bb[]=new array1[3];
        bb[0]=a;
        bb[1]=aa;
        bb[2]=ar;
        for (array1 array2:bb){
            System.out.println(array2.id + " " + array2.name + " " + array2.address);
        }
    }
}
