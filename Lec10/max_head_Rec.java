package Lec10;

public class max_head_Rec {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4};
        System.out.println(max_(arr, 0));
    }
    public static int max_(int arr[],int i){
        if(i==arr.length) return Integer.MIN_VALUE;
        int max=max_(arr,i+1);
        return Math.max(max,arr[i]);
    }
}
