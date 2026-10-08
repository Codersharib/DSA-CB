package Days45.Arrays;

import java.util.HashMap;

public class divisible_subarrays {
    public static void main(String[] args) {
        
        int[] arr={5 ,5, 5, 5, 5};
        System.out.println(divisible_array(arr,5));
    }
    
    public static int divisible_array(int[] arr, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        int c=0;
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            // get rem
            int r=prefixSum%k;
            if(r<0) r+=k;
            if(map.containsKey(r)){
                c+=map.get(r);
            }
            map.put(r,map.getOrDefault(r, 0)+1);
        }
        return c;
    }
}
