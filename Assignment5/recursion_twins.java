package Assignment6;
import java.util.Scanner;

public class recursion_twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String que=sc.next();
        System.out.print(twins(que, 0, 0,0));
    }
    public static int twins(String que,int si,int ei,int ans){
        if(que.length()==ei){
            return ans;
        }
        if(ei<2) {
            return twins(que, si,ei+1,ans);
        }
        if(que.charAt(si)==que.charAt(ei)){
            return twins(que, si+1,ei+1,ans+1);
        }
        return twins(que, si+1,ei+1,ans);
    }
}
