package Days45.recursion;


public class countVowel {
    public static void main(String[] args) {
        System.out.println(vol("sharib", 0));
    }
    public static int vol(String que,int ans){
        if(que.length()==0){
            return 0;
        }
        if(Character.toString(que.charAt(0)).matches("[aeiouAEIOU]")){
            ans=1;
        }
        else ans=0;
        return ans+vol(que.substring(1),ans);
    }
}
