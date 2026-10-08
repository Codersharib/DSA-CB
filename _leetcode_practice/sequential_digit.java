package _leetcode_practice;
import java.util.*;
public class sequential_digit {
    public static void main(String[] args) {
        int low=1000,high=13000;
        seq(low, high);
    }
    public static List<Integer> seq(int low,int high){
        List<Integer> ll=new ArrayList<>();
        String num="123456789";
        for(int j=0;j<num.length();j++) {
            int si=0;
            for(int i=1+j;i<=num.length() && si <i ;i++) {
                String s=num.substring(si,i);
                if(Integer.parseInt(s)>=low && Integer.parseInt(s)<=high){
                    // System.out.println(Integer.parseInt(s));
                    ll.add(Integer.parseInt(s));
                }
                if(Integer.parseInt(s)>high) return;
                si++;
            }
        }
        return ll;
    }
}
