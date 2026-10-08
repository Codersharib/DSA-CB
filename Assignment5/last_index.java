package Assignment6;
import java.util.*;
public class last_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(last(arr,arr.length-1,m));
    }
    public static int last(int[] arr,int i,int m){
        if(i<0) return -1;
        if(arr[i]==m) return i;
        return last(arr, i-1, m);
    }
}
