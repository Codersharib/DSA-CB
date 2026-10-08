package _Recursion_que_prac;

public class smallest_digit {
    public static void main(String[] args) {
        System.out.println(smallest(1234));
    }
    public static int smallest(int n){
        if(n==0) return Integer.MAX_VALUE;
        int digit=n%10;
        int min=smallest(n/10);
        return Math.min(min,digit);
    }
}
