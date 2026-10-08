package _leetcode_practice;

public class climb_stairs {
    public static void main(String[] args) {
        
    }
    public static int count(int[] cache, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if(cache[n]!=0) return cache[n];
        int x=0;
        for (int dice = 1; dice <= 2; dice++) {
             x+=count(cache, n - dice);
        }
        cache[n]=x;
        return x;
        
    }
}
