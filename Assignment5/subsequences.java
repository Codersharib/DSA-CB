package Assignment6;

import java.util.Scanner;

public class subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String que=sc.next();
        subsequences(que, "");
        System.out.println("\n"+subsequences1(que, ""));
    }
    public static void subsequences(String que,String ans){
        if(que.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=que.charAt(0);
        subsequences(que.substring(1), ans+"");
        subsequences(que.substring(1), ans+ch);
    }
    public static int subsequences1(String que,String ans){
        if(que.length()==0){
            // System.out.print(ans+" ");
            return 1;
        }
        char ch=que.charAt(0);
        int x=subsequences1(que.substring(1), ans+"");
        int y=subsequences1(que.substring(1), ans+ch);
        return x+y;
    }
}
