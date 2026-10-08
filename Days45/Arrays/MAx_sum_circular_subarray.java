package Days45.Arrays;

public class MAx_sum_circular_subarray {
    public static void main(String[] args) {
        int[] arr={5,-3,5};
        System.out.println(kedane(arr));
    }
    public static int kedane(int[] arr){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int currsum2=0;
        int minSum=Integer.MAX_VALUE;
        int total_sum=0;
        for (int i = 0; i < arr.length; i++) {
            // max kedane
            currsum+=arr[i];
            maxSum=Math.max(maxSum, currsum);
            if(currsum<0){
                currsum=0;
            }
            // min kedane
            currsum2+=arr[i];
            minSum=Math.min(minSum, currsum2);
            if(currsum2>0) currsum2=0;
            // total sum
            total_sum+=arr[i];
        }
        return Math.max(maxSum, total_sum-minSum);
    }
}
