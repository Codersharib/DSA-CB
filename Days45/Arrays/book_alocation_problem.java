package Days45.Arrays;

import java.util.*;

public class book_alocation_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int stu = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(book(arr, stu));
        }
    }

    public static int book(int[] arr, int stu) {
        int l = 1;
        int h = Arrays.stream(arr).sum();
        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isValid(arr, stu, mid)) {
                h = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] arr, int stu, int mid) {
        int c = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;
            }
            if (sum + arr[i] > mid) {
                sum = arr[i];
                c++;
            } else {
                sum += arr[i];
            }
        }
        return c <= stu;
    }
}
