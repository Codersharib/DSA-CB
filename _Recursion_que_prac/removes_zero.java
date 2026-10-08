package _Recursion_que_prac;

public class removes_zero {
    public static void main(String[] args) {
        rem_zero(1023, 0);
    }
    public static void rem_zero(int n,int rem){
        if(n==0){
            System.out.println(rem);
            return;
}
        int digit=n%10;
        if(digit!=0){
            rem=rem+digit*10;
        }
        rem_zero(n/10,rem*10);
    }
}
