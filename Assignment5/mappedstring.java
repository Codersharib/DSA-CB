package Assignment6;
import java.util.*;
public class mappedstring {
    public static void main(String[] args) {
        
    }
    static char[] mapped = {'\0','A', 'B', 'C', 'D', 'E', 'F', 'G','H', 'I', 'J', 'K', 'L', 'M', 'N','O', 'P', 'Q', 'R', 'S', 'T', 'U','V', 'W', 'X', 'Y', 'Z'
};
    public static void mapped(String que,int start,List<Integer> ll,int[] arr){
        if(que.length()==0){
            int i=0;
            while(i<ll.size()){
                System.out.print(arr[ll.get(i)++]);
            }
            return ;
        }
        
        for(int end=start+1;end<=que.length();end++) {
            String piece=que.substring(start,end);
            ll.add(Integer.parseInt(piece));
            mapped(que, end, ll, arr);
            ll.remove(ll.size()-1);
        }
    }
}
