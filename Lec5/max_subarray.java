package Lec5;

public class max_subarray {
    public static void main(String[] args) {
        int arr[]={2,3,-7,4,-1,8};
        System.out.print(max_sum(arr));
    }
    public static int max_sum(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
