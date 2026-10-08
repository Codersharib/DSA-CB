package Lec31;

import java.util.Arrays;

public class single_no_III {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,2,3,11,23,5,7};
        System.out.println(Arrays.toString(single_No_III(arr)));
    }
    public static int[] single_No_III(int[] arr){
        int xor=0;
        for (int i : arr) {
            xor=xor^i;
        }
        int mask=(xor& (-1*xor));
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]& mask)==0){
                a^=arr[i];
            }
        }
        int b=xor^a;
        int []ar={a,b};
        return ar;
    }
}
