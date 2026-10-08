package Lec19;

import java.util.*;

public class LinkedList_java {
    public static void main(String[] args) {
        // LinkedList<Integer> ll=new LinkedList<>();
        Queue<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
    }
}
