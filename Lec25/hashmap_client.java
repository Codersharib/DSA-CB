package Lec25;

public class hashmap_client {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("raj",94);
        map.put("shiva",78);
        map.put("ankita",74);
        map.put("puneet",66);
        map.put("manoj",77);
        map.put("kunal",77);
        map.put("ankita",79);
        map.put(null,74);
        System.out.println(map);
    }
}
