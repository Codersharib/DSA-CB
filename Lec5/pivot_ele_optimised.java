package Lec5;

public class pivot_ele_optimised {
    public static void main(String[] args) {
        int[] arr={2,3,-1,8,4};
        System.out.print(pivot(arr));
    }
    public static int pivot(int arr[]){
        int n=arr.length;
        // prefix
        int[] left=new int[n];
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+arr[i-1];
        }
        // sufix
        int right[]=new int[n];
        right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }

        // calculation
        for (int i = 0; i < n; i++) {
            if(left[i]==right[i]) return i;
        }
        return -1;

    }
}
