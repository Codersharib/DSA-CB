package _leetcode_practice;

public class search_rotated_sorted_arr {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 3));
    }
    public static int search(int arr[],int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>=arr[l]){
                if(arr[mid]>=target && arr[l]<=target){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[h]>=target && arr[mid]<=target){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
