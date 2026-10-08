package _Recursion_que_prac;

public class count_digit {
    public static void main(String[] args) {
        System.out.println(countDigit(1234));
    }
    public static int countDigit(int n){
        if(n==0) return 0;
        int digit=n%10;
        return 1+countDigit(n/10);
    }
}
