package demo1.MethodDeclaration;

public class CallStaticMethod {
    //    demo2()//
//    {
//        System.out.println("no argument constructor");
//    }
//    demo2(int a)
//    {
//        System.out.println("one argument constructor");
//    }
//    demo2(int a,int b){
//        System.out.println("two argument constructor");
//
//    }
    public void student(int a ,String b ){
        System.out.println("student "+ a +"String "+b);

    }
    public static void student2(int a ,String b)
    {
        System.out.println("Static");
    }
    public static void main(String[]args){
//         demo2 dm=new demo2(10,20,30);
//         dm.student(1,"abc");
//         demo2.student2(2,"Static");
        CallStaticMethod dm=new CallStaticMethod();
//        demo2 dm1=new demo2(10,20);
    }
}
