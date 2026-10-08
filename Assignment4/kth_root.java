import java.util.*;
public class kth_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            kthroot(n,k);
        }
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
