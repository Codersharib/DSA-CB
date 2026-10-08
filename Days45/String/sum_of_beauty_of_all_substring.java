package Days45.String;

public class sum_of_beauty_of_all_substring {
    public static void main(String[] args) {
        System.out.println(beauty_sum("aabcbaa"));
    }
    public static int beauty_sum(String s){
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq=new int[26];
            for (int j = i; j < s.length(); j++) {
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for (int k : freq) {
                    if(k>0){
                        max=Math.max(max,k);
                        min=Math.min(min,k);
                    }
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}
