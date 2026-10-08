package _Recursion_que_prac;

public class string_contains_only_digit {
    public static void main(String[] args) {
        System.out.println(isDigit("1236764"));
    }
    public static boolean isDigit(String s){
        if(s.length()==0) return true;
        char ch=s.charAt(0);
        if(!(ch>='0'&& ch<='9')){
            return false;
        }
        return isDigit(s.substring(1));
    }
}
