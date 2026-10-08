package _Recursion_que_prac;

public class count_vowel {
    public static void main(String[] args) {
        System.out.println(CV("aniskausar"));
    }
    public static int CV(String s){
        if(s.length()==0) return 0;
        char ch=s.charAt(0);
        int ans=0;
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            ans=1;
        }
        return ans+CV(s.substring(1));
    }
}
