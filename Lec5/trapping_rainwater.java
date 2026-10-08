package Lec5;

public class trapping_rainwater {
    public static void main(String[] args) {
        int[] arr={5,3,1,2,7,4,1,6};
        System.out.print(RainWater(arr));
    }
    public static int RainWater(int[] arr){
        int n=arr.length;
        // prefix_max
        int[] left=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        // suffix_max
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            right[i]=Math.max(right[i+1],arr[i]);
            
        }
        // calc
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }
}
