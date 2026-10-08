package Lec12;

public class permuattion2 {

    public static void main(String[] args) {
        String ques = "abca";
        permuattion_(ques, "");
    }

    public static void permuattion_(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (is_present(ques, ch, i + 1) == false) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                permuattion_(s1 + s2, ans + ch);
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
