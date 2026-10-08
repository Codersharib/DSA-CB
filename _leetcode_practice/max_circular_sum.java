package _leetcode_practice;

public class max_circular_sum {
    public static void main(String[] args) {
        
    }
    public static int max_cir_sum(int arr[]){
        // min kdane
        int i=0;
        int curmax=0;
        int max_kadane=Integer.MIN_VALUE;
        int curmin=0;
        int min_kadane=Integer.MAX_VALUE;
        int totalsum=0;
        while(i<arr.length){
            // max kadane
            curmax+=arr[i];
            max_kadane=Math.max(max_kadane,curmax);
            if(curmax<0){
                curmax=0;
            }
            // min kdane
            curmin+=arr[i];
            min_kadane=Math.min(min_kadane,curmin);
            if(curmin>0) curmin=0;
            //  total sum
            totalsum+=arr[i];
            i++;

        }
        if(max_kadane<0) return max_kadane;
        // final return max(max kadane,totalsum-minkdane)
        return Math.max(max_kadane,totalsum-min_kadane);
    }
}
