package Lec31;

public class count_set_bit {

    public static void main(String[] args) {
        int n = 84;
        System.out.println(count_setbit(n));
        System.out.println(fastcount_setbit(n));
    }

    public static int count_setbit(int n) {
        // ologn
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static int fastcount_setbit(int n) {
        // ologn
        int count = 0;
        while (n > 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
}
