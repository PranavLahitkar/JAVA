package demo1.practice;

public class throwExp {
    public void even(int a){
        if (a%2==0){
            throw new ArithmeticException("even number");
        }
        else{
            System.out.println("not even");
        }
    }
    public void divide(int a,int b)throws ArithmeticException{
        int c=0;
        try {
            c = a / b;
        }
        catch (Exception e){
            System.out.println("uiyygy");
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        throwExp t=new throwExp();
        t.divide(7,0);
        t.even(8);
    }
}
