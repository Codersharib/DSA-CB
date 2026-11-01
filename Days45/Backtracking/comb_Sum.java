package Days45.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comb_Sum {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int target=8;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        combi_Sum(arr,target, 0, ll, ans);
        System.out.println(ans);
    }
    public static void combi_Sum(int[] candidate,int target,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for (int i = idx; i < candidate.length; i++) {
            if(i>idx && candidate[i]==candidate[i-1]) continue;

            if(candidate[i]>target) break;

            if(target - candidate[i] >=0){
                ll.add(candidate[i]);
                combi_Sum(candidate, target-candidate[i], i+1, ll, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
