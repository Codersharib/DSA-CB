package _Recursion_que_prac;

public class print_arr {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,4};
        print(arr,0);
    }
    public static void print(int arr[],int i){
        if(arr.length==i) return ;
        System.out.print(arr[i]+" ");
        print(arr, i+1);
    }
}
