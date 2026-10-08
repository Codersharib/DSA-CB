package Lec10;

public class sum_of_n_natural_num {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n));
    }
    public static int Sum(int n){
        if(n==0) return 0;
        return n+Sum(n-1);
    }
}
