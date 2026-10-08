package Days45.recursion;

public class max {
    public static void main(String[] args) {
        int[] arr={3,6,2,5,2,9};
        System.out.println(Max(arr,0));
    }
    public static int Max(int[] arr,int i){
        if(i==arr.length){
            return Integer.MIN_VALUE;
        }
        return Math.max(Max(arr, i+1), arr[i]);
    }
}
