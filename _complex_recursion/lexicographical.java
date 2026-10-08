import java.util.*;
public class lexicographical {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        // lexicographical_(1000, 0,ll);
        // System.out.print(ll);
        System.out.println(lexicographical_(1000, 0));
    }
    // public static void lexicographical_(int n,int curr,List<Integer> ll){
    //     if(curr>n){
    //         return ;
    //     }
    //     // System.out.print(curr+" ");
    //     ll.add(curr);
    //     int i=0;
    //     if(curr==0){
    //         i=1;
    //     }
    //     for(;i<=9;i++){
    //         lexicographical_(n, curr*10+i,ll);
    //     }
    // }
    // static int count=0;
    public static int lexicographical_(int n,int curr){
        if(curr>n){
            return 0;
        }
        // System.out.print(curr+" ");
        int x=1;
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            x+=lexicographical_(n, curr*10+i);
        }
        return x;
    }
}
