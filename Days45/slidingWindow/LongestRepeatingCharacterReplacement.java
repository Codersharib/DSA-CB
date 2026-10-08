package Days45.slidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(longestCharSeq("AABABBA",'A',1));
    }
    public static int longestCharSeq(String s,int k){
        int[] freq= new int[26];
        int si=0,ei=0;
        int maxf=0;
        int maxlen=0;
        while(ei<s.length()){
            char ch=s.charAt(ei);
            freq[ch-'A']++;
            maxf=Math.max(maxf, freq[ch-'A']);
            while((ei-si+1)-maxf>k){
                freq[s.charAt(si)-'A']--;
                si++;
            }
            maxlen=Math.max(maxlen,ei-si+1);
            ei++;
        }
        return maxlen;
    }
}
