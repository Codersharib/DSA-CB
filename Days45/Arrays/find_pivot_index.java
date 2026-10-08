package Days45.Arrays;

public class find_pivot_index {
    public static void main(String[] args) {
        int [] arr={1,7,3,6,5,6};
        System.out.println(pivot(arr));
    }
    public static int pivot(int[] arr){
        int n=arr.length;
        // prefix
        int[] left=new int[n];
        left[0]=0;
        for (int i = 1; i < left.length; i++) {
            left[i]=left[i-1]+arr[i-1];
        }
        // suffix
        int[] right=new int[n];
        right[n-1]=0;
        for (int i = arr.length-2; i >=0; i--) {
            right[i]=right[i+1]+arr[i+1];
        }
        // cals
        for (int i = 0; i < right.length; i++) {
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}
