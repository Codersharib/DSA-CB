package _leetcode_practice;

import java.util.*;

public class longest_subseq_bitwise_or_not_0 {

    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        int[] arr={1,2,3};
        System.out.println(bitwise_or(arr));
    }
    public static int bitwise_or(int[] arr){
        if(arr.length==1) return 1;
        int[] dp=new int[arr.length+1];
        for (int i = 0; i < arr.length-1; i++) {
            int[] dp2=new int[arr.length+1];
            dp2[0]=arr[i];
            int c=1;
            for (int j = i+1; j < arr.length; j++) {
                if((dp2[j-1] ^ arr[j])!=0){
                    c++;
                    dp2[j]=dp2[j-1] ^ arr[j];
                }
                else{
                    dp2[j]=dp2[j-1];
                }
            }
            dp[i] = Math.max(i == 0 ? 0 : dp[i-1], c);
            
        }
        return dp[dp.length-2];
    }




    // public static void bitwise_or(int[] arr, List<Integer> ll, int i) {
    //     if (i == arr.length) {
    //         System.out.println(ll);
    //         return;
    //     }
    //     bitwise_or(arr, ll, i + 1);
    //     if(arr[i]!=0){
    //         ll.add(arr[i]);
    //     }
    //     arr[i]=0;
    //     bitwise_or(arr, ll, i + 1);
    //     if((arr[i]^(ll.get(ll.size()-1)))!=0){
    //         ll.remove(ll.size()-1);
    //     }
    // }

}
