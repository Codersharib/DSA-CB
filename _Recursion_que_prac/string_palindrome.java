package _Recursion_que_prac;

public class string_palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome_check("aabakja",0));
    }
    public static boolean palindrome_check(String s,int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        
        return palindrome_check(s,i+1);
    }
}
