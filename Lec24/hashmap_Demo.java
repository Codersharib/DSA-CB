package Lec24;

import java.util.HashMap;

public class hashmap_Demo {
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
        // get
        System.out.println(map.get("raj"));
        System.out.println(map.get("ankita"));
        //  containsKey
        System.out.println(map.containsKey("ankit"));
        // remove
        System.out.println(map.remove("ankita"));
    }
}
