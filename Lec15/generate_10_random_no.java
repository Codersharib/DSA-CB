package Lec15;
import java.util.*;
public class generate_10_random_no {
    public static void main(String[] args) {
        int si=10;
        int ei=100;
        Random rn=new Random();
        for(int i=1;i<=10;i++) {
            int x=rn.nextInt(ei-si+1)+si;
            System.out.println(x);
        }
    }
}
