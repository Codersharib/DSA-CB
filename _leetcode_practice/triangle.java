import java.util.*;
package _leetcode_practice;

public class triangle {
    public static void main(String[] args) {
        
    }
    public static int mintotal(List<List<Integer>> ll){
        int min_sum=0;
        for(int i=0;i<ll.size();i++){
            if(!ll.get(i).isEmpty()){
            min_sum+=Collections.min(ll.get(i));
            }
        }
        return min_sum;
    }
}
