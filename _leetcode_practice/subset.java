package _leetcode_practice;
import java.util.*;
public class subset {
    public static void main(String[] args) {
        
    }
    public static void print(int[] arr,int i,List<Integer> curr,List<List<Integer>> res){
        if(i==arr.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        print(arr, i+1, curr, res);
        curr.add(arr[i]);
        print(arr, i+1, curr, res);
        curr.remove(curr.size()-1);
    }
}
