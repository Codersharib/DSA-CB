package _Recursion_que_prac;

public class count_consonant {
    public static void main(String[] args) {
        System.out.println(CC("coding"));
    }
    public static int CC(String s){
        if(s.length()==0) return 0;
        char ch=s.charAt(0);
        int ans=0;
        if(!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')){
            ans=1;
        }
        return ans+CC(s.substring(1));
    }
}
