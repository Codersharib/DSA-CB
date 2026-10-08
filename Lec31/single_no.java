package Lec31;

public class single_no {
    public static void main(String[] args) {
        System.out.println( {3,6,3,7,3});
    }
    public static int singleNumber(int[] arr){
        int xor=0;
        for (int i : arr) {
            xor=xor^i;
        }
        return xor;
    }
}
