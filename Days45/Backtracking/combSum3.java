package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combSum3 {
    public static void main(String[] args) {
        int target=1;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combSum3(target, 4, 0, ll, ans,1);
        System.out.println(ans);
    }
    public static void combSum3(int target ,int k,int qpsf,List<Integer> ll,List<List<Integer>> ans,int idx){
        if(qpsf==k && target ==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(qpsf>k || target <0) return ;
        for (int i = idx; i <=9; i++) {
            if(target -i >=0){
                ll.add(i);
                combSum3(target-i, k, qpsf+1, ll, ans,i+1);
                ll.remove(ll.size()-1);
            }
        }
    }
}
