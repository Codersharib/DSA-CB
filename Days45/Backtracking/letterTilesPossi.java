package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class letterTilesPossi {

    public static void main(String[] args) {
        List<List<Character>> ans = new ArrayList<>();
        List<Character> ll = new ArrayList<>();
        tiles("AAB", 0, ans, ll);
        System.out.println(ans);
    }

    public static void tiles(String que, int idx, List<List<Character>> ans, List<Character> ll) {
        if(idx==que.length()) return;
        if(!ans.contains(ll)){
            ans.add(new ArrayList<>(ll));
        }
        for (int i = idx; i < que.length(); i++) {
            ll.add(que.charAt(i));
            tiles(que, i, ans, ll);
            ll.remove(ll.size()-1);
        }
    }
}
