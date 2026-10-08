package Lec5;

public class keddanes_algo {
    public static void main(String[] args) {
        
    }
    public static int kedanes(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
                sum+=arr[i];
                ans=Math.max(ans,sum);
                if(sum<0){
                    sum=0;
                }
        }
        return ans;
    }
}
