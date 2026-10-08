package Assignment6;

import java.util.Scanner;

public class monu_bhaiya_string {
    static char[] mapped = {
    'a', 'b', 'c', 'd', 'e', 'f', 'g',
    'h', 'i', 'j', 'k', 'l', 'm', 'n',
    'o', 'p', 'q', 'r', 's', 't', 'u',
    'v', 'w', 'x', 'y', 'z'};
    static int[] arr=new int[26];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        monu(s);
        String ans="";
        for(int i=0;i<26;i++) {
            if(arr[i]==1){
                ans=ans+mapped[i];
            }
        }
        System.out.println(ans);
    }
    public static void monu(String s){
        if(s.length()==0) return ;
        char ch=s.charAt(0);
        if(arr[ch-'a']!=1){
            arr[ch-'a']=1;
        }
        monu(s.substring(1));
    }
}
