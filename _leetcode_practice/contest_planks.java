package _leetcode_practice;

import java.util.ArrayList;
import java.util.List;

public class contest_planks {
    public static void main(String[] args) {
        int[] planks = {2,3,7};
        System.out.println(maximumWidth(planks));
    }
    public static int maximumWidth(int[] planks) {
        int ans=0;
        List<Integer> ll=new ArrayList<>();
        List<Integer> ele=new ArrayList<>();
        
        for(int i=0;i<planks.length;i++){
            ele.add(planks[i]);
            if(!ll.contains(planks[i])){
                ll.add(planks[i]);
            }
        }
        for(int val:ll){
            int res=how_much_pair(planks,val);
            ans=Math.max(ans,res);
        }
        return ans;
    }
    public static int how_much_pair(int[] arr,int item){
        List<Integer> ele=new ArrayList<>();
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            ele.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item) c++;
            else if (arr[i] != 0 && arr[i] < item) {
                int idx = ele.indexOf(item - arr[i]);
                if (idx !=-1 && idx !=i ){
                    c++;
                    arr[idx] = 0;
                    arr[i] = 0;
                    ele.set(i, 0);
                    ele.set(idx, 0);
                }
            }else{
                continue;
            }
        }
        return c;
    }
}
