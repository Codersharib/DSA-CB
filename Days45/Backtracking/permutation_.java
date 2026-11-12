package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutation_ {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        permu(nums ,used,ans, ll);
        System.out.println(ans);
    }

    public static void permu(int[] nums,boolean[] used, List<List<Integer>> ans, List<Integer> ll) {
        if(nums.length==ll.size()){
            // if(!ans.contains(ll))
                ans.add(new ArrayList<>(ll));
            return;
        }

        for (int j =0; j < nums.length; j++) {
            if(!used[j]){
                used[j]=true;
                ll.add(nums[j]);
                permu(nums,used, ans, ll);
                ll.remove(ll.size() - 1);
                used[j]=false;
            }
        }
    }
}
