package _leetcode_practice;


public class palindrome_phrasess {
    public static void main(String[] args) {
        
    }
    public static boolean is__Palindrome(String s){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char lower=Character.toLowerCase(s.charAt(i));
                sb.append(lower);
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)) return false;
        }
        return true;

    }
}
