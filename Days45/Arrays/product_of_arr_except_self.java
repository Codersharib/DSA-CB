package Days45.Arrays;

import java.util.Arrays;

public class product_of_arr_except_self {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }
    public static int[] product(int[] arr){
        int n=arr.length;
        // left
        int[] left=new int[n];
        left[0]=1;
        for (int i = 1; i < left.length; i++) {
            left[i]=left[i-1]*arr[i-1];
        }
        // right
        int[] right=new int[n];
        right[n-1]=1;
        for (int i = n-2; i >=0; i--) {
            right[i]=right[i+1]*arr[i+1];
        }
        // calc
        for (int i = 0; i < right.length; i++) {
            left[i]=left[i]*right[i];
        }
        return left;
    }
}
