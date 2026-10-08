package _Recursion_que_prac;

public class check_prime {
    public static void main(String[] args) {
        System.out.print(isPrime(7));
    }
    public static boolean isPrime(int n){
        if(n==1||n==0) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0){
            return false;
        }
        return isPrime(n-1);
    }
}
