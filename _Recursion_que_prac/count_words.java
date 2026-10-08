package _Recursion_que_prac;

public class count_words {
    public static void main(String[] args) {
        System.out.println(CW("my.  sharib."));
    }
    public static int CW(String s){
        if(s.length()==0) return 1;
        char ch=s.charAt(0);
        int ans=0;
        if(ch==' '){
            ans=1;
        }
        return ans+CW(s.substring(1));
    }
}
