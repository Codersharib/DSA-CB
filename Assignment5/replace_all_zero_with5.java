package Assignment6;
import java.util.*;
public class replace_all_zero_with5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(replace(n));
    }
    public static int replace(int n){
        if(n==0) return 0;
        int dig=n%10;
        if(dig==0) dig=5;
        return replace(n/10)*10 +dig;
    }
}
