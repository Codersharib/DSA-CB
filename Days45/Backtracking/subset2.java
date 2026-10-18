package Days45.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        int[] arr={1,2,2};
        Arrays.sort(arr);
        Subset(arr, ans, ll, 0);
        System.out.println(ans);
    }
    public static void Subset(int[] arr,List<List<Integer>> ans,List<Integer> ll,int i){
        if(i==arr.length){
            if(!ans.contains(ll)){
                ans.add(new ArrayList<>(ll));
            }
            return ;
        }
        Subset(arr, ans, ll, i+1);
        ll.add(arr[i]);
        Subset(arr, ans, ll, i+1);
        ll.remove(ll.size()-1);
    }
    
}
