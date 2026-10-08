package Days45.slidingWindow;

import java.util.HashSet;

public class longest_non_repeating_char {

    public static void main(String[] args) {

    }

    public static int longest(String s) {
        int si = 0, ei = 0;
        int max=0;
        HashSet<Character> set=new HashSet<>();
        while (ei < s.length()) {
            char c = s.charAt(ei);
            while (set.contains(c)) {
                set.remove(s.charAt(si));
                si++;
            }
            set.add(c);
            max=Math.max(max, ei-si+1);
            ei++;
        }
        return max;
    }
}
