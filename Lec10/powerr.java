package Lec10;

public class powerr {
    public static void main(String[] args) {
        System.out.println(power_(3,4));
    }
    public static int power_(int a,int n){
        if(n==0) return 1;
        int res=power_(a,n-1);
        return res*a;
    }
}
