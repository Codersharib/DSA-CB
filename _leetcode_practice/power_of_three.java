package _leetcode_practice;

public class power_of_three {
    public static void main(String[] args) {
        System.out.println(powr(3, 27));
    }
    public static int powr(int n,int x){
        if(n==1) return 1;
        int y=3*powr(n-1, x) ;
        if(x==y) return 1;
        else return 0;
    }
}
