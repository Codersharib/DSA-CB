package sliding_window;

public class subarray_pro_less_than_k {
    public static void main(String[] args) {
        int[] arr={10,5,2,6};
        int k=100;
        System.out.println(product_less_k(arr, k));
    }
    public static int product_less_k(int[] arr,int k){
        int ans=0;
        int p=1,si=0,ei=0;
        // grow
        while(ei<arr.length){
            p*=arr[ei];
            // shrink
            while(p>=k){
                p/=arr[si];
                si++;
            }
            // ans update
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
}
