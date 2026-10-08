package Lec6;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={4,-1,5,3,2,1,7};
        // System.out.println(min_from_ith_index(arr,2));
        selection(arr);
        display(arr);
    }
    public static void selection(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min=min_from_ith_index(arr,i);
            // swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static int min_from_ith_index(int[] arr,int idx){
        int min=idx;
        for(int i=idx+1;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }


    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
