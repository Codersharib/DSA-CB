package Lec6;

public class BS {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,9,11,13};
        int item=7;
        System.out.print(search(arr,item));
    }
    public static int search(int arr[], int item){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==item) return mid;
            else if(arr[mid]<item) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
