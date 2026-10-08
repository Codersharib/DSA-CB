package Lec25;
import java.util.*;
public class counting_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
        int[] a=sort(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] sort(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        int[] freq=new int[max+1];
        // counting freq of each element
        for (int i = 0; i < arr.length; i++) {
             freq[arr[i]]++; //freq[arr[i]]=freq[arr[i]]+1;
        }
        // prefix sum of freq
        for (int i = 1; i < freq.length; i++) {
            freq[i]=freq[i-1]+freq[i];
        }
        //  main thing 
        int[] ans=new int[arr.length];
        
        for (int i=arr.length-1;i>=0;i--) {
            int c=freq[arr[i]];
            ans[c-1]=arr[i];
            freq[arr[i]]--;
        }
        return ans;
    }
}
