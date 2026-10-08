package _leetcode_practice;
import java.util.*;
public class subsets2 {
    public static void main(String[] args) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        subset2(arr, 0, curr, res);
        System.out.print(res);
    }
    public static void subset2(int arr[],int n,List<Integer>curr,List<List<Integer>> res){
        if(n==arr.length){
            List<Integer> curr_copy=new ArrayList<>(curr);
            Collections.sort(curr_copy);
            if(!res.contains(curr_copy)){
                res.add(new ArrayList<>(curr_copy));
            }
            return;
        }
        subset2(arr, n+1, curr, res);
        curr.add(arr[n]);
        subset2(arr, n+1, curr, res);
        curr.remove(curr.size()-1);
    }
}
