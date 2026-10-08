package Lec30;

import java.util.Arrays;

public class edit_distance {
    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        int[][] dp=new int[word1.length()][word2.length()];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
    }
    public static int MiniOpres(String word1 ,String word2,int i,int j){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }
        int ans=0;
        if(word1.charAt(i)==word2.charAt(j)){
            ans=MiniOpres(word1, word2, i+1, j+1);
        }
        else{
            int I=MiniOpres(word1, word2, i, j+1);
            int R=MiniOpres(word1, word2, i+1, j+1);
            int D=MiniOpres(word1, word2, i+1, j);
            ans=1+Math.min(R, Math.min(I, D));
        }
        return ans;
    }
}
