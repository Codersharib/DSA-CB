package Lec24;

import java.util.HashMap;
import java.util.Set;

public class hashmap_demo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        // add
        map.put("raj",94);
        map.put("shiva",78);
        map.put("ankita",74);
        map.put("puneet",66);
        map.put("manoj",77);
        map.put("kunal",77);
        map.put("ankita",79);
        map.put(null,74);
        System.out.print(map);
        System.out.println();
        Set<String> set=map.keySet();
        // for (String string : set) {
        //     System.out.print(string+" ");
        // }
        for (String string : map.keySet()) {
            System.out.print(string+" ");
        }

    }
}
