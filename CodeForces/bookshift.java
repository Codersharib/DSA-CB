package CodeForces;
import java.util.Scanner;
public class bookshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(shift(arr));
        }
    }
    public static String shift(int[] a){
        int n=a.length;
        long[] arr=new long[n];
        for(int i=0;i<n;i++) {
            arr[i]=a[i];
        }
        long need = 1;
        for(int i = 0; i < n - 1; i++) {
            if(a[i] < need)
                return "NO";
            a[i+1] += a[i] - need;
            need++;
        }
        if(a[n-1] >= need)
            return "YES";
        else
            return "NO";
    }
}
