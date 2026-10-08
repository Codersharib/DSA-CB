package Lec5;

public class product_array_except_self {
    public static void main(String[] args) {
        int[] arr={2,3,6,4};
        int[] ans=pro_arr_exe_self(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] pro_arr_exe_self( int[] arr){
        int n=arr.length;
        // prefix_product
        int[] left=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        
        // suffix_product
        int[] right=new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        // calculation
        for(int i=0;i<n;i++){
            left[i]=left[i]*right[i];
        }
        return left;
    }
}
