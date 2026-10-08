package Lec5;

public class middleIndex {
    public static void main(String[] args) {
        int[] arr={2,3,-1,8,4};
        System.out.print(middle_idx(arr));
    }
    public static int middle_idx(int [] arr){
        int n=arr.length;
        // prefix_sum
        int[] left=new int[n];
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+arr[i-1];
        }
        // suffix_sum
        int[] right=new int[n];
        right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }
        // calc
        for(int i=0;i<n;i++) {
            if(left[i]==right[i]) return i; 
        }
        return -1;
    }
}
