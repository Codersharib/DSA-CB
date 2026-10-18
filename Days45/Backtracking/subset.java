package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        int[] arr={1,2,3};
        Subset(arr, ans, ll, 0);

    }
    public static void Subset(int[] arr,List<List<Integer>> ans,List<Integer> ll,int i){
        if(i==arr.length){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        Subset(arr, ans, ll, i+1);
        ll.add(arr[i]);
        Subset(arr, ans, ll, i+1);
        ll.remove(ll.size()-1);
    }
}
