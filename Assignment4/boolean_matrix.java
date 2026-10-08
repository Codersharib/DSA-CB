import java.util.*;
public class boolean_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int arr[][]=new int[M][N];
        for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        display(arr);
        System.out.println();
        boolean_matrix(arr);
        display(arr);
    }
    public static void boolean_matrix(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        boolean[] row=new boolean[rows];
        boolean[] col=new boolean[cols];
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++) {
                if(arr[i][j]==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++) {
                if(row[i] || col[j]){
                    arr[i][j]=1;
                }
            }
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
