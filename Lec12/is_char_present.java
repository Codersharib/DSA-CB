package Lec12;

public class is_char_present {
    public static void main(String[] args) {
        String str="abcbhjaijai";
        char ch='a';
        int i=2;
        System.out.println(is_present(str, ch, i));
    }
    public static boolean is_present(String str,char ch,int idx){
        for(int i=idx;i<str.length();i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
