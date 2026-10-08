import java.util.*;

public class combination_sum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combination(candidates, target, ll, 0,ans);
        System.out.print(ans);
    }

    public static void combination(int coin[], int amount, List<Integer> ll, int idx,List<List<Integer>> ans) {
        if (amount == 0) {
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                combination(coin, amount - coin[i], ll, i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
