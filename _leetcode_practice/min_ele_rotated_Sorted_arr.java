package _leetcode_practice;

public class min_ele_rotated_Sorted_arr {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(findmin(arr));
    }
    public static int findmin(int[] arr){
        int min=Integer.MAX_VALUE;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=arr[l]){
                min=Math.min(min,arr[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                h=mid-1;
            }
        }
        return min;
    }
}
