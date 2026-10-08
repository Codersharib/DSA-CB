import java.util.Scanner;

public class upper_triange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        upper_triangle(arr);
    }
    public static void upper_triangle(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(0);
            }
            for(int j=i;j<n;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
