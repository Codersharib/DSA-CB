package Days45.Backtracking;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] res=Twosum(nums,target);
        System.out.print(res[0]+" "+ res[1]);

    }
    public static int[] Twosum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for (int i = 0; i < arr.length; i++) {
            int req=target-arr[i];
            if(map.containsKey(req)){
                ans[0]=map.get(req);
                ans[1]=i;
                return ans;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return null;
    }
}
