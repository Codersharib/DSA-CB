package Lec24;

import java.util.*;

public class set_Demo {
    public static void main(String[] args) {
        // HashSet<Integer> set=new HashSet<>();
        // TreeSet<Integer> set=new TreeSet<>();
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        // add
        set.add(10);
        set.add(2);
        set.add(9);
        set.add(7);
        set.add(7);
        set.add(-4);
        System.out.println(set);
        // get
        System.out.println(set.contains(7));
        System.out.println(set.contains(17));
        // remove
        System.out.println(set.remove(7));
        System.out.println(set.remove(2));
        System.out.println(set);
        for(int x:set) {
            System.out.print(x+" ");
        }
    }
}
