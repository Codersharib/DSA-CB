package Assignment5;
import java.util.*;
public class vivek_array_partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(arr_game(arr, 0, arr.length-1));
        }
    }
    public static int arr_game(int[] arr, int si, int ei) {
        if (si == ei) return 0;

        int best = 0;
        for (int k = si; k < ei; k++) {
            int pi = partition(arr, si, ei, k);
            if (pi != -1) {
                int left = arr_game(arr, si, pi);
                int right = arr_game(arr, pi + 1, ei);
                int score = 1 + Math.max(left, right);
                if (score > best) best = score;
            }
        }
        return best;
    }

    public static int partition(int[] arr, int si, int ei, int k) {
        int sum = 0;
        int sum2 = 0;
        for (int i = si; i <= k; i++) {
            sum += arr[i];
        }
        for (int j = k + 1; j <= ei; j++) {
            sum2 += arr[j];
        }
        if (sum == sum2) {
            return k;
        }
        return -1;
    }
}
