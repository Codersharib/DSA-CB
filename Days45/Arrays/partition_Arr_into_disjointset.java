package Days45.Arrays;

public class partition_Arr_into_disjointset {
    public static void main(String[] args) {
        int [] arr={5,0,3,8,6};
        System.out.println(disjoint(arr));
    }
    public static int disjoint(int[] arr){
        int n=arr.length;
        // prefix
        int[] left=new int[n];
        left[0]=arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        // suffix
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for (int i = arr.length-2; i >=0; i--) {
            right[i]=Math.min(right[i+1],arr[i]);
        }
        // cals
        for (int i = 0; i < right.length; i++) {
            if(left[i]<=right[i+1]) return i+1;
        }
        return -1;
    }
}
