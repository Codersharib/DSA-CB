package Lec31;

public class check_ith_bit_set_unset {
    public static void main(String[] args) {
        int n=84;
        int i=4;
        System.out.println(ith_bit_set(n, i));
    }
    public static boolean  ith_bit_set(int n,int i){
        int mask=(1<<i);
        if((n&mask) !=0) return true;
        else return false;
    }
}
