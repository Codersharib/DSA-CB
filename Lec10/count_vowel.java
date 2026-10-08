package Lec10;

public class count_vowel {
    public static void main(String[] args) {
        String s="coding";
        System.out.println(countVowel(s));
    }
    public static int countVowel(String s){
        if(s.length()==0) return 0;
        char ch=s.charAt(0);
        int ans=0;
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            ans=1;
        }
        return ans+countVowel(s.substring(1));
    }
}
