package Lec28;

public class fibo_prac {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        System.out.println(fib(n));
        System.out.println(fibTD(n,dp));
        System.out.println(fibBU(n));
    }
    // noraml recusrion
    public static int fib(int n){
        if(n==1 || n==0) return n;
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }
    // memoisation/ top down/ recursive
    public static int fibTD(int n,int[] dp){
        if(n==1 || n==0) return n;
        if(dp[n] !=0) return dp[n];
        int f1=fib(n-1);
        int f2=fib(n-2);
        dp[n]=f1+f2;
        return f1+f2;
    }
    // tabulation/ bottom up/ iterative
    public static int fibBU(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];
    }

}
