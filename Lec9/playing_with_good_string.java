import java.util.*;
public class playing_with_good_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(good_string(str));
    }
    public static int good_string(String s){
        // int i=0;
        int max_len=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<s.length();i++){

            if(isvowel(s.charAt(i))){
                count++;
                max_len=Math.max(max_len,count);
            }
            else{
                count=0;
            }
        }
        return max_len;
    }
    public static boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}
