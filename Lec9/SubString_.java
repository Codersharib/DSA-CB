package Lec9;

public class SubString_ {
    public static void main(String[] args) {
        String s="Coding";
        System.out.println(s.substring(2,5));
        substr(s);
    }
    public static void substr(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++) {
                String str=s.substring(i,j);
                if(ispalindrome(str)){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
