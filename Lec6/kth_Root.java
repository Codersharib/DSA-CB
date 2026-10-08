package Lec6;

public class kth_Root {
    public static void main(String[] args) {
        int n=149;
        int k=3;
        System.out.print(k_root(n,k));
    }
    public static int k_root(int n,int k){
        int l=0;
        int h=n;
        int ans =0;
        while(l<=h){
            int mid=(l+h)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}
