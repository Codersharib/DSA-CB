package Lec8;

public class two_D_array_Demo {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[1][3]);
        // System.out.println(arr);
        int rows=arr.length;
        int cols=arr[0].length;
        System.out.println(rows);
        System.out.println(cols);

    }
}
