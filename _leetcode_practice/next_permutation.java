package _leetcode_practice;

public class next_permutation {
    public static void main(String[] args) {
        
    }
    public static void nextPermuation(int arr[]){
        int n=arr.length;
        // find the dip
        int temp=arr[n-1];
        boolean found=false;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                // find dip
                int j=n-1;
                while(arr[j]<=arr[i]){
                    j--;
                }
                // swap
                int curr=arr[i];
                arr[i]=arr[j];
                arr[j]=curr;
                found=true;
                // reverse
                reverse(arr,i+1,n-1);
                found=true;
                break;
            }
        }
        if(!found){
            reverse(arr,0,n-1);
        }
        // then reverse from dip+1 to last element 
        // edge case if no dip found means arr is desc then just reverse whole array
        
    }
    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
