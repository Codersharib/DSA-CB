package CodeForces;
import java.util.*;

public class iskander_drawing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(line(n, s));
        }
    }

    public static int line(int n, String s) {

        int ans = 0;
        int i = 0;

        while (i < n) {

            if (s.charAt(i) == '#') {

                int len = 0;

                while (i < n && s.charAt(i) == '#') {
                    len++;
                    i++;
                }

                ans = Math.max(ans, (len + 1) / 2);
            } else {
                i++;
            }
        }

        return ans;
    }
}
