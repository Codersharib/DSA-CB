package CodeForces;
import java.util.*;
public class another_pop_count_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            System.out.println(sequence(n,k));
        }
    }
    public static long sequence(long n, long k) {
    long lo = 0, hi = k * 30; 
    while (lo < hi) {
        long mid = (lo + hi + 1) / 2;
        if (cost(mid, k) <= n) lo = mid; else hi = mid - 1;
    }
    return lo;
}

private static long cost(long B, long k) {
    long q = B / k, r = B % k;
    if (q >= 62) return Long.MAX_VALUE / 2; 
    return (1L << q) * (k + r) - k;
}
}
