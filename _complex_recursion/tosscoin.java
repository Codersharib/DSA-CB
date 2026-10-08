public class tosscoin {
    public static void main(String[] args) {
        System.out.print(toss(3, ""));
    }
    public static int toss(int n,String ans){
        if(n==0){
            return 1;
        }
        int x=0;
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            x=toss(n-1, ans+"H");

        }
        int y=toss(n-1, ans+"T");
        return x+y;
    }
}
