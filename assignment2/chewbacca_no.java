import java.util.*;
public class chewbacca_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        chewbacca(n);
    }
    public static void chewbacca(long n){
        long sum=0;
        long mul=1;
        while(n>0){
            long rem=n%10;
            long temp=rem;
            long fn=9-rem;
            n/=10;
            if(fn<rem){
                rem=fn;
            }
            if(n==0 && rem==0){
                rem=temp;
            }
            sum=sum+rem*mul;
            mul*=10;
        }
        System.out.println(sum);
    }
}
