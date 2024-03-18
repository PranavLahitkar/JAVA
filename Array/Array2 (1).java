package demo1.ArrayExp;

import demo1.ArrayExp.Array1;

public class Array2 {
    public static void main(String[] args) {
        Array1 ar=new Array1(1, "abc" ,25000);
        Array1 a=new Array1(2,"ashu", 300000);
        Array1 arr=new Array1(3,"pqr",12345);
        Array1 aa[]=new Array1[3];
        aa[0]=ar;
        aa[1]=a;
        aa[2]=arr;
        for (Array1 Array2:aa){
            System.out.println(Array2.emp_id + " " + Array2.emp_name + " " + Array2.emp_salary);
        }
    }
}
