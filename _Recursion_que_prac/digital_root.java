package _Recursion_que_prac;

public class digital_root {

    public static void main(String[] args) {
        System.out.println(DR(4538));
    }

    public static int DR(int n){
        if(n<10) return n;
        return DR(sum_digit(n));
        
    }
    public static int sum_digit(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        int sum = DR(n / 10);
        return digit+sum;
    }
}
