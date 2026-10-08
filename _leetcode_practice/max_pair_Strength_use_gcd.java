package _leetcode_practice;

public class max_pair_Strength_use_gcd {
    public static void main(String[] args) {
        int[] arr={2,3,5};
        System.out.println(max_strength(arr));
    }
    public static long gcd(long a,long b){
        return a%b==0? b:gcd(b, a%b);
    }
    public static long max_strength(int[] arr){
        long ans=Long.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++) {
                // got all pairs
                long g=gcd(arr[i], arr[j]);
                long strength=(arr[i]/g)*(arr[j]/g);
                ans=Math.max(ans, strength);
            }
        }
        return ans;
    }
}
