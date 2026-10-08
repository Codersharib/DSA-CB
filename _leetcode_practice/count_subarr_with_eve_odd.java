package _leetcode_practice;

public class count_subarr_with_eve_odd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        int a = 2, b = 1;
        System.out.println(c_ratio_subarr(arr, a, b));
    }

    public static int c_ratio_subarr(int[] arr, int a, int b) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            int y = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    x++; 
                }else {
                    y++;
                }
                // check valid
                if (y > 0 && (long) x * b <= (long) a * y) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
