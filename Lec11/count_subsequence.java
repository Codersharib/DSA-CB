package Lec11;

public class count_subsequence {
    public static void main(String[] args) {
        String ques="abc";
        // print(ques, "");
        System.out.println("\n"+print(ques, ""));
        // System.out.println("\n"+count);
    }
    // m1 to count 

    // static int count=0;
    // public static void print(String ques,String ans){
    //     if(ques.length()==0) {
    //         System.out.print(ans+" ");
    //         count++;
    //         return ;
    //     }
    //     char ch=ques.charAt(0);
    //     print(ques.substring(1), ans);
    //     print(ques.substring(1), ans+ch);
    // }

    // m2 to count using recursion
    public static int print(String ques,String ans){
        if(ques.length()==0) {
            // System.out.print(ans+" ");
            return 1;
        }
        char ch=ques.charAt(0);
        int x=print(ques.substring(1), ans);
        int y=print(ques.substring(1), ans+ch);
        return x+y;
    }
}
