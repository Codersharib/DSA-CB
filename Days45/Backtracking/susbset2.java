package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class susbset2 {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        int[] arr={1,2,2};
        subset2_(arr,0,ans,ll);
        System.out.println(ans);
    }
    public static void subset2_(int[] nums,int i,List<List<Integer>> ans,List<Integer> ll){
        // if(!ans.contains(ll)){
        //     ans.add(new ArrayList<>(ll));
        // }
        ans.add(new ArrayList<>(ll));
        for (int j = i; j < nums.length; j++) {
            if(j>i && nums[j]==nums[j-1]) continue;
            ll.add(nums[j]);
            subset2_(nums, j+1, ans, ll);
            ll.remove(ll.size()-1);
        }
    }
}
