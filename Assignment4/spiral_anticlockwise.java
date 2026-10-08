import java.util.Scanner;

public class spiral_anticlockwise {
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
        spiral_print(arr);
    }
    public static void spiral_print(int[][] arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int c=arr.length*arr[0].length;
        int count=0;
        while(count<c){
            for(int i=minr;i<=maxr && count<c;i++){
                System.out.print(arr[i][minc]+", ");
                count++;
            }
            minc++;
            for(int i=minc;i<=maxc && count<c;i++){
                System.out.print(arr[maxr][i]+", ");
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<c;i--){
                System.out.print(arr[i][maxc]+", ");
                count++;
            }
            maxc--;
            for(int i=maxc;i>=minc && count<c;i--){
                System.out.print(arr[minr][i]+", ");
                count++;
            }
            minr++;
        }
    }
}
