package Assignment6;
import java.util.*;
public class hi_bye {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        hi_bye(s, "", "");
    }
    static int count=0;
    public static void hi_bye(String que,String ans,String ans2){
        if(que.length()==0){
            System.out.println(count);
            System.out.println(ans);
            System.out.println(ans2);
            return;
        }
        char ch=que.charAt(0);
        if(ch=='h' && que.length()>=2 && que.charAt(1)=='i'){
            ans2=ans2+"bye";
            count++;
            hi_bye(que.substring(2), ans, ans2);
        }
        else{
            ans2=ans2+ch;
            ans=ans+ch;
            hi_bye(que.substring(1), ans, ans2);
        }
    }
}
