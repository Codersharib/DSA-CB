import java.util.*;
package Lec12;

public class letter_comb_phone_no {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        String ques="23";
        List<String> ll=new ArrayList<>();
        letter_comb_ph_no(ques, "",ll);
    }
    public static void letter_comb_ph_no(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            // System.out.println(ans);
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=key[ch-'0'];
        for(int i=0;i<press.length();i++) {
            letter_comb_ph_no(ques.substring(1), ans+press.charAt(i),ll);
        }        
    }
}
