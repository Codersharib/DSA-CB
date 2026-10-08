package Lec10;

public class arr_is_sorted {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4};
        System.out.println(isSorted(arr, 0));
    }
    public static boolean isSorted(int arr[],int i){
        if(arr.length-1==i) return true;
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
}
