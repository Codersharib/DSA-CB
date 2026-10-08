package _Recursion_que_prac;

public class largest_digit {
    public static void main(String[] args) {
        System.out.println(largest_(1234));
    }
    public static int largest_(int n){
        if(n==0){
            return Integer.MIN_VALUE;
        } 
        int digit=n%10;
        int max=largest_(n/10);
        return Math.max(max,digit);
    }
}
