package _leetcode_practice;

public class count_kthroot {
    public static void main(String[] args) {
        
    }
    public static int countKthroots(int l, int r,int k){
        int total=kthroot(r,k);
        int subtotal=kthroot(l-1,k);
        return total-subtotal;
    }
    public static int kthroot(long n,int k){
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
        return (int)max_x;
    }
}
