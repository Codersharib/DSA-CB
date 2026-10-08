import java.util.*;
public class squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        kthroot(n,2);
        
    }
    public static void kthroot(long n,int k){
        long l=0;
        long h=n;
        long max_x=0;
        while(l<=h){
            long mid=l+(h-l)/2;
            long tempval=(long)Math.pow(mid,k);
            if(tempval>n){
                h=mid-1;
            }
            else{
                max_x=mid;
                l=mid+1;
            }
        }
        System.out.println(max_x);
    }
}
