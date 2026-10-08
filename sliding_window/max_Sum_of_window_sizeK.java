package sliding_window;

public class max_Sum_of_window_sizeK {
    public static void main(String[] args) {
        int[] arr={2,3,1,3,1,3,1,3,8,2,1};
        int k=3;
        System.out.println(sum_of_k_size(arr, k));
    }
    public static int sum_of_k_size(int [] arr,int k){
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
        }
        for(int i=k;i<arr.length;i++) {
            sum+=arr[i];
            sum=sum-arr[i-k];
            ans=Math.max(sum, ans);
        }
        return ans;
    }
}
