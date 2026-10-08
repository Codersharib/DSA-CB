package Lec29;

public class LIS_nlogn {

    public static void main(String[] args) {
        int[] arr = {0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(lis(arr));
    }

    public static int lis(int arr[]) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for (int i = 1; i < dp.length; i++) {
            if (arr[i] > dp[len - 1]) {
                dp[len] = arr[i];
                len++;
            } else {
                int idx = BinarySearch(dp, 0, len - 1, arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }

    public static int BinarySearch(int[] dp, int l, int h, int item) {
        int ans = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (dp[mid] >= item) {
                ans = mid;
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
