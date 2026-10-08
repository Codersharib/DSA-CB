package Days45.recursion;

public class permutation {
    public static void main(String[] args) {
        permutation("abca", "");
    }
    public static void permutation(String que,String ans){
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < que.length(); i++) {
            char ch=que.charAt(0);
            if(!present(que, ch, i+1)){
                String s1=que.substring(0,i);
                String s2=que.substring(i+1,que.length());
                permutation(s1+s2, ans+ch);
            }
        }
    }
    public static boolean present(String que,char ch,int i){
        for (int j = i; j < que.length(); j++) {
            if(que.charAt(i)==ch) return true;
        }
        return false;
    }
}
