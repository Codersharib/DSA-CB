package Lec5;

public class pivot_element {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        System.out.print(pivot(arr));
    }
    public static int pivot(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            if(sum_left(arr,0,i)==sum_right(arr,i+1,n-1)) return i;
        }
        return -1;
    }
    public static int sum_left(int[] arr,int si,int ei){
        int sum=0;
        for(int i=si;i<ei;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int sum_right(int[] arr, int si,int ei){
        int sum=0;
        for(int i=si;i<=ei;i++){
            sum+=arr[i];
        }
        return sum;
        
    }
}
