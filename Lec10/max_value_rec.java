package Lec10;

public class max_value_rec {
    public static void main(String[] args) {
        int[] arr={2,3,4,77,4};
        System.out.println(max_(arr, 0,arr[0]));
    }
    public static int max_(int[] arr,int i,int maxx){
        if(i==arr.length-1) return maxx;
        maxx=Math.max(arr[i],arr[i+1]);
        return max_(arr, i+1,maxx);
    }
}
