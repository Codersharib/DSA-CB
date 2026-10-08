package _leetcode_practice;

public class single_ele_in_sorted_arr {
    public static void main(String[] args) {
        int arr[]={4,4,5,7,7,9,9,11,11};
        int target=0;
        System.out.print(single_Non_duplicate(arr));
    }
    public static int single_Non_duplicate(int arr[]){
        int l=1,h=arr.length-2;
        int n=arr.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(n==1) return arr[0];
            if(arr[0]!=arr[1]) return arr[0];
            if(arr[n-1]!=arr[n-2]) return arr[n-1];
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
            else if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        } 
        return -1;
    }
}
