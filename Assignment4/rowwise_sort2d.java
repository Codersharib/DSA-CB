import java.util.*;

public class rowwise_sort2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        row_wise_sort_2d(arr);
        display(arr);
    }
    public static void row_wise_sort_2d(int arr[][]){
        for(int i=0;i<arr.length;i++) {
            Arrays.sort(arr[i]);
        }
    }
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
