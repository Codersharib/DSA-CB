package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        boolean[] used=new boolean[arr.length];

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Permutation(arr, used, ans, ll);
        System.out.println(ans);

    }
        public static void Permutation(int[] arr,boolean used[],List<List<Integer>> ans,List<Integer> ll){
            if(ll.size()==arr.length){
                if(!ans.contains(ll))
                    ans.add(new ArrayList<>(ll));
                return ;
            }
            for (int i = 0; i < arr.length; i++) {
                if(!used[i]){
                    used[i]=true;
                    ll.add(arr[i]);
                    Permutation(arr, used, ans, ll);
                    ll.remove(ll.size()-1);
                    used[i]=false;
                }
            }
        }
    
}
