package Lec5;

public class container_most_water {

    public static void main(String[] args) {

    }

    public static int max_area(int[] arr) {
        int right = arr.length-1;
        int left=0;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int water=Math.min(arr[left],arr[right])*(right-left);
            max=Math.max(max,water);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return max;
    }
}
