package _Recursion_que_prac;

public class product_digit {
    public static void main(String[] args) {
        System.out.println(proDigit(1234));
    }
    public static int proDigit(int n){
        if(n==0) return 1;
        int digit=n%10;
        return digit*proDigit(n/10);
    }
}
