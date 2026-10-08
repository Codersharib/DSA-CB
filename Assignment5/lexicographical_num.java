package Assignment6;
import java.util.*;
public class lexicographical_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        lexicigrapgical(n, 0);
    }
    public static void lexicigrapgical(int n,int curr){
        if(curr>n) return;
        System.out.print(curr+" ");
        int i=0;
        if(curr==0) {
            i=1;
        }
        for(;i<=9;i++) {
            lexicigrapgical(n, curr*10+i);
        }
    }
}
