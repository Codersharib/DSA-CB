package sliding_window;
import java.util.*;
public class kartik_bhaiya_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=sc.nextInt();
        int flip_a=longest_perfect_string(str, k, 'a');
        int flip_b=longest_perfect_string(str, k, 'b');
        System.out.println(Math.max(flip_a,flip_b));
    }
    public static int longest_perfect_string(String ques,int k,char ch){
        int si=0,ei=0,flip=0,ans=0;
        // grow
        while(ei<ques.length()){
            if(ques.charAt(ei)==ch){
                flip++;
            }
            // shrink
            while(flip>k){
                if(ques.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            // ans update
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
