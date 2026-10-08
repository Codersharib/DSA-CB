package _Recursion_que_prac;

public class sum_of_even_digit {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,4,-4};
        System.out.println(sumEven(arr,0));
    }
    public static int sumEven(int arr[],int i){
        if(arr.length==i) return 0;
        int ans=0;
        if(arr[i]%2==0){
            ans=arr[i];
        }
        return ans+sumEven(arr, i+1);
    }
}
