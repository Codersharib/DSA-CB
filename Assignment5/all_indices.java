package Assignment6;
import java.util.*;
public class all_indices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        List<Integer> ll=new ArrayList<>();
        List<Integer> ll2=all_index(arr,0,m,ll);
        for(int num:ll2) {
            System.out.print(num+" ");
        }
    }
    public static List<Integer> all_index(int[] arr,int i,int m,List<Integer>ll){
        if(i==arr.length) return ll;
        if(arr[i]==m) {
            ll.add(i);
        }
        return all_index(arr, i+1, m,ll);
    }
}
