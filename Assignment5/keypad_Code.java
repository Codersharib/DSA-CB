package Assignment6;
import java.util.*;
public class keypad_Code {
    static String arr[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","ws","yz"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        keypad_combination(num, "");
        System.out.println();
        System.out.println(c);
    }
    static int c=0;
    public static void keypad_combination(String que,String ans){
        if(que.length()==0){
            System.out.print(ans+" ");
            c++;
            return;
        }
        String ch=arr[que.charAt(0)-'0'];
        for(int i=0;i<ch.length();i++) {
            keypad_combination(que.substring(1), ans+ch.charAt(i));
        }
    }
}
