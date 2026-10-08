package Days45.recursion;

public class coinToss {

    public static void main(String[] args) {
        toss(4, "");
    }

    public static void toss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.length()>0 && ans.charAt(ans.length() - 1) != 'H') {
            toss(n - 1, ans + 'H');
        }
        if(ans.length()==0){
            toss(n - 1, ans + 'H');
        }
        // 2 calls
        toss(n - 1, ans + 'T');
    }
}
