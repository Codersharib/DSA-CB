package Assignment6;
import java.util.*;
public class generate_binary_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            binary_string(s, "", 0);
        }
    }
    public static void binary_string(String que,String ans,int si){
        if(si==que.length()){
            System.out.println(ans);
            return;
        }
        if(que.charAt(si)!='?'){
            binary_string(que, ans+que.charAt(si),si+1);
        }
        else{
            for(int i=0;i<=1;i++) {
                binary_string(que, ans+i, si+1);
                // binary_string(que, ans+i, si);
                // binary_string(que, ans+i, si);
            }
        }
    }
}
