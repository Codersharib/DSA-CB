package _Recursion_que_prac;

public class sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sum_digit(158));
    }
    public static int sum_digit(int n){
        if(n==0) return 0;
        int digit=n%10;
        return digit+sum_digit(n/10);
    }
}
