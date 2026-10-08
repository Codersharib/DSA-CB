package Lec10;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(5);
    }
    public static int fib(int n){
        if(n==1 || n==0) return n;
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }
}
