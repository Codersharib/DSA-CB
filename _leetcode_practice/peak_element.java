package _leetcode_practice;

public class peak_element {

    public static void main(String[] args) {
        int [] arr={1,2,3,1};
        System.out.println(peak(arr));
    }

    public static int peak(int[] arr) {
        int l = 1;
        int h = arr.length - 2;
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[h + 1] > arr[h]) {
            return h+1;
        }
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] >arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                h = mid - 1;
            }
            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            }
        }
        return -1;
    }
}
