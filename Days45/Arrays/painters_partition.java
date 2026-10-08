package Days45.Arrays;

import java.util.*;

public class painters_partition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int painter = sc.nextInt();
            int cost = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(painters(arr, painter,cost));
        }
    }

    public static int painters(int[] arr, int painter, int costPerUnit) {
        // base case
        if (painter > arr.length) {
            int max = Arrays.stream(arr).max().getAsInt();
            return max * costPerUnit;
        }
        int l = 1;
        int h = Arrays.stream(arr).sum();
        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isValid(arr, painter, costPerUnit, mid)) {
                h = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans * costPerUnit;
    }

    public static boolean isValid(int[] arr, int painter, int costPerUnit, int time) {
        int sum = 0;
        int c = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > time) {
                return false;
            }
            if (sum + arr[i] > time) {
                sum = arr[i];
                c++;
            } else {
                sum = sum + arr[i];
            }
        }
        return c <= painter;
    }
}
