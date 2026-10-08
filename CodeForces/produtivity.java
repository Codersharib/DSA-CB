package CodeForces;
import java.io.*;
import java.util.*;

public class produtivity {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            long[] a = new long[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            boolean[] allowed = new boolean[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int x = Integer.parseInt(st.nextToken());
                allowed[x] = true;
            }
            // build
            List<Long> segments = new ArrayList<>();
            long sum = 0;
            for (int i = n; i >= 1; i--) {
                sum += a[i];
                if (allowed[i]) {
                    segments.add(sum);
                    sum = 0;
                }
            }
            if (sum != 0) {
                segments.add(sum);
            }
            Collections.reverse(segments);
            //dp
            long dpNotFlip = 0;
            long dpFlip = Long.MIN_VALUE / 2; 

            for (long segmentSum : segments) {
                long newNotFlip = Math.max(dpNotFlip + segmentSum, dpFlip - segmentSum);
                long newFlip = Math.max(dpFlip + segmentSum, dpNotFlip - segmentSum);
                dpNotFlip = newNotFlip;
                dpFlip = newFlip;
            }

            long answer = Math.max(dpNotFlip, dpFlip);
            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
