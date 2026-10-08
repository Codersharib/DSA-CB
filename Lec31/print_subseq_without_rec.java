package Lec31;

public class print_subseq_without_rec {
    public static void main(String[] args) {
        String s="abc";
        subsequence(s);
    }
    public static void subsequence(String s){
        int n=s.length();
        for (int i = 0; i < (1<<n); i++) {
            subsequence_(s,i);
        }
    }
    public static void subsequence_(String s,int i){
        String ans="";
        int pos=0;
        while(i>0){
            if((i&1) !=0){
                ans=ans+s.charAt(pos);
            }
            pos++;
            i>>=1;
        }
        System.out.println(ans);
    }
}
