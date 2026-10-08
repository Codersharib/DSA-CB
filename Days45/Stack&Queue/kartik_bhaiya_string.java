package Days45;

public class kartik_bhaiya_string {
    public static void main(String[] args) {
        int flipb=find_longest_subseq("aaabaaabaaabaabaa", 'b', 2);
        int flipa=find_longest_subseq("aaabaaabaaabaabaa", 'a', 2);
        System.out.println(Math.max(flipb, flipa));
    }
    public static int find_longest_subseq(String s,char ch,int k){
        int si=0,ei=0,flip=0;
        int ans=0;
        while(ei<s.length()){
            // grow
            if(s.charAt(ei)==ch){
                flip++;
            }
            // shrink
            while(flip>k){
                if(s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            // update
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
