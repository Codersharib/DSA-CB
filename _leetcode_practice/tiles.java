package Lec12;
import java.util.*;
public class tiles {

    public static void main(String[] args) {
        String ques = "abca";
        List<String> ll=new ArrayList<>();
        permuattion_(ques, "",ll);
    }

    public static void permuattion_(String ques, String ans,List<String> ll) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (is_present(ques, ch, i + 1) == false) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                // ans=ans+ch;
                // ll.add(ans);
                permuattion_(s1 + s2, ans+ch,ll);
            }
        }
    }

    public static boolean is_present(String str, char ch, int idx) {
        for (int i = idx; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
