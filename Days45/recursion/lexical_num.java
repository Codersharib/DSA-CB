package Days45.recursion;

import java.util.ArrayList;
import java.util.List;

public class lexical_num {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        int n=1000;
        lexical(n, 0, ll);
        System.out.println(ll);
    }
    public static void lexical(int n,int curr,List<Integer> ll){
        if(curr>n){
            return ;
        }
        if(curr!=0){
            ll.add(curr);
        }
        int i=0;
        if(curr==0){
            i=1;
        }
        for (; i <= 9; i++) {
            lexical(n, curr*10+i, ll);
        }
    }
}
