package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        comb_sum(candidates, target, 0, ll, ans);
    }
    public static void comb_sum(int[] coin,int target,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for (int i = idx; i < coin.length; i++) {
            if(target>=coin[i]){
                ll.add(coin[i]);
                comb_sum(coin, target-coin[i], i, ll, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
