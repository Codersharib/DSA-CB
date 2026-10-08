package _leetcode_practice;
import java.util.*;
public class sum_of_gcd_of_formed_pairs {
    public static void main(String[] args) {
        int[] arr={2,6,4};
        System.out.println(gcd_sum(arr));
    }
    public static int gcd(int divd,int div){
        return divd%div==0? div:gcd(div,divd%div);
    }
    public static int gcd_sum(int[] arr){
        // if(arr.length<2) return arr[0];
        int max=0;
        int[] prefix_gcd=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            prefix_gcd[i]=gcd(arr[i], max);
        }
        Arrays.sort(prefix_gcd);
        int sum_pairs=0;
        int j=arr.length-1;
        int i=0;
        while(i<j){
            sum_pairs+=gcd(prefix_gcd[i], prefix_gcd[j]);
            i++;
            j--;
        }
        return sum_pairs;
    }
}
