package Days45.slidingWindow;

import java.util.Scanner;

public class monu_bhaiya_score {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long k = sc.nextLong();
        System.out.println(sliding(arr, k));
    }

    public static long sliding(int[] arr, long k) {
        int si = 0, ei = 0;
        long sum = 0;
        long ans = 0;
        while (ei < arr.length) {
            sum += arr[ei];
            while (sum * (ei - si + 1) >= k) {
                sum -= arr[si++];
            }

            ans += ei - si + 1;
            ei++;
        }
        return ans;
    }
}
