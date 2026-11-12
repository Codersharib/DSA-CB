package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class goodArray {
    public static void main(String[] args) {
        // System.out.println(gcd1(new int[]{}));
        int[] arr={12,5,7,23};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        boolean[] used=new boolean[arr.length];
        GoodArray(arr, ans, ll, 0,used);
        System.out.println(ans);
    }
    public static boolean GoodArray(int[] arr,List<List<Integer>> ans,List<Integer> ll,int i,boolean[] used){
        // ans.add(new ArrayList<>(ll));
        if(gcd1(ll)==1) return true;
        for (int j = i; j < used.length; j++) {
            ll.add(arr[i]);
            boolean res=GoodArray(arr, ans, ll, j+1, used);
            ll.remove(ll.size()-1);
        }

        return false;
    }
    public static int gcd1(List<Integer> arr){
        if(arr.size()==0) return -5;
        if(arr.size()==1){
            return (int)Math.abs(arr.get(0));
        }
        int ans=gcd(arr.get(0),arr.get(1));
        for (int i = 2; i < arr.size(); i++) {
            ans=gcd(ans, arr.get(i));
        }
        return ans;
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
