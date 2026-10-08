package _Recursion_que_prac;

public class sum_of_arr {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,4};
        System.out.println(arr_sum(arr, 0));
    }
    public static int arr_sum(int arr[],int i){
        if(arr.length==i) return 0;
        return arr[i]+arr_sum(arr, i+1); 
    }
}
