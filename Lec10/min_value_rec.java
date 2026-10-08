package Lec10;

public class min_value_rec {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4};
        System.out.println(min_(arr, 0));
    }
    public static int min_(int arr[],int i){
        if(i==arr.length) return Integer.MAX_VALUE;
        int min=min_(arr,i+1);
        return Math.min(min,arr[i]);
    }
}
