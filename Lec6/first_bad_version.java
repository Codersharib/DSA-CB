package Lec6;

public class first_bad_version {
    public static void main(String[] args) {
        System.out.print(firstBadVersion(5));
    }
    public static int firstBadVersion(int n){
        int l=1;
        int h=n;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isBadVersion(mid)==true){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    private static boolean isBadVersion(int mid){
        return false;
    }
}
