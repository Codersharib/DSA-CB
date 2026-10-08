package Assignment6;

import java.util.Scanner;

public class replace_all_pi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            String s=sc.next();
            System.out.println(replace(s));
        }
    }
    public static String replace(String que){
        if(que.length()==0){
            return "";
        }
        char ch=que.charAt(0);
        if(ch=='p'  && que.length() >= 2 && que.charAt(1)=='i'){
            return "3.14"+replace(que.substring(2));
        }
        else{
            return ch+replace(que.substring(1));
        }
    }
}
