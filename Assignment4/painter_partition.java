
import java.util.*;



      public class painter_partition {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int painter = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(painter_par(arr, painter));

        }
    

    public static int painter_par(int[] arr, int painter) {
        int l = 0;
        int h = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            h += arr[i];
            if(l<arr[i]){
                l=arr[i];
            }
        }
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isValid(arr, mid, painter)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return ans;

    }

    public static boolean isValid(int arr[], int boards, int painter) {
        int count_painter = 0;
        int i = 0;
        while (i < arr.length) {
            int currsum = 0;
            while (i < arr.length && arr[i] + currsum <= boards) {
                currsum += arr[i];
                i++;
            }
            count_painter++;
            currsum = 0;
        }
        if (count_painter <= painter) {
            return true; 
        }else {
            return false;
        }
    }
}

