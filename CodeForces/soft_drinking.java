package CodeForces;
import java.util.*;
public class soft_drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        System.out.println(soft_drinking(n, k, l, c, d, p, nl, np));
    }
    public static int soft_drinking(int n,int k,int l,int c,int d,int p,int nl,int np){
        int toast1=(k*l)/nl;
        int toast2=c*d;
        int toast3= p/np;
        int min=Integer.MAX_VALUE;
        if(toast1<toast2){
            if(toast3<toast1){
                min=toast3;
            }
            else{
                min=toast1;
            }
        }
        else{
            if(toast3<toast2){
                min=toast3;
            }
            else{
                min=toast2;
            }
        }
        return min/n;
    }
}
