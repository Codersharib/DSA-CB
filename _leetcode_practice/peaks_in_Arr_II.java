package _leetcode_practice;

import java.util.ArrayList;
import java.util.List;

public class peaks_in_Arr_II {
    public static void main(String[] args) {
        int[] nums={3,6,2,7,1};
        int[][] queries={{1,1,3},{2,3,0},{1,0,4}};
        int res[]=peak_in_Arr2(nums, queries);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
    public static int[] peak_in_Arr2(int[] nums,int[][] queries){
        List<Integer> ll=new ArrayList<>();
        for (int[] a : queries) {
            if(a[0]==1){
                int count=count_subarr(nums, a[1], a[2]);
                ll.add(count);
            }
            else{
                nums[a[1]]=a[2];
            }
        }
        int ans[]=new int[ll.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=ll.get(i);
        }
        return ans;
    }
    public static int count_subarr(int[] nums,int i,int j){
        int count=0;
        for (int l = i; l <= j-2; l++) {
            boolean haspeak=false;
            for (int m = l+2; m <= j; m++) {
                int k=m-1;
                if(nums[k]>nums[k-1] && nums[k]>nums[k+1]){
                    haspeak=true;
                }
                if(haspeak) count++;
            }
        }
        return count;
    }
}
