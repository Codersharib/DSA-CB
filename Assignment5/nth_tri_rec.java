package Assignment6;
import java.util.*;
public class nth_tri_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nth_tri(n));
    }
    public static int nth_tri(int n){
        if(n==0) return 0;
        return n+nth_tri(n-1);
    }
}
