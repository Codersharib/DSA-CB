package _Recursion_que_prac;

public class palindrome {
    public static void main(String[] args) {
        System.out.print(palindrome_(12421));
    }
    public static boolean palindrome_(int n){
        if(reverse(n, 0)==n) return true;
        return false;
    }
    private static int reverse(int n,int rev){
        if(n==0) return rev ;
        return reverse(n/10, rev*10+n%10);
    }
}
