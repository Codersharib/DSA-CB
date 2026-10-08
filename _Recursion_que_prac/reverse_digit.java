package _Recursion_que_prac;

public class reverse_digit {
    public static void main(String[] args) {
        System.out.println(reverse(1234,0));
    }
        public static int reverse(int n,int rev){
            if(n==0) return rev;
            int rem=n%10;
            return reverse(n/10,rev*10+rem);
        }
        
}
