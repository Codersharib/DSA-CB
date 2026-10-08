package Days45.slidingWindow;

import java.util.*;

public class subarraySum_k {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        subarray(arr, 3);
    }

    public static int subarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        int sum=0;
        map.put(0,1);
        for (int i : arr) {
            sum+=i;
            int need=sum-k;
            if(map.containsKey(need)){
                c+=map.get(need);
            }
            map.put(k, map.getOrDefault(k, 0)+1);
        }
        return c;
    }
}
