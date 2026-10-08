package Assignment6;
import java.util.*;
public class first_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(first(arr,0,m));
    }
    public static int first(int[] arr,int i,int m){
        if(i==arr.length) return -1;
        if(arr[i]==m) return i;
        return first(arr, i+1, m);
    }
}
