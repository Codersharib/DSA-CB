package Days45.recursion;

public class subSeq {
    public static void main(String[] args) {
        seq("abc", "");
    }
    public static void seq(String que,String ans){
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        seq(que.substring(1), ans+"");
        seq(que.substring(1), ans+que.charAt(0));
    }
    
}
