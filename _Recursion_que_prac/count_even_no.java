package _Recursion_que_prac;

public class count_even_no {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,4,-4};
        System.out.println(countEven(arr,0));
    }
    public static int countEven(int arr[],int i){
        if(arr.length==i) return 0;
        int ans=0;
        if(arr[i]%2==0){
            ans=1;
        }
        return ans+countEven(arr, i+1);
    }
}
