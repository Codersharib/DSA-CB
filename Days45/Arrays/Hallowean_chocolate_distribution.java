package Days45.Arrays;

import java.util.*;

public class Hallowean_chocolate_distribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int c = sc.nextInt();
            int n = sc.nextInt();
            if (c == 0 && n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = hallow(arr, c);
            if (ans == null) {
                System.out.println("no sweets");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int idx : ans) {
                    sb.append(idx).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }

    public static int[] hallow(int[] arr, int c) {
        int[] ans = new int[c];
        Arrays.fill(ans, -1);
        long sum = 0;
        ans[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = (int) (sum % c);
            if (ans[rem] != -1) {
                int start = ans[rem] + 1;
                int end = i + 1;
                int[] result = new int[end - start + 1];
                for (int k = start; k <= end; k++) {
                    result[k - start] = k;
                }
                return result;
            }
            ans[rem] = i + 1;
        }
        return null;
    }
}
