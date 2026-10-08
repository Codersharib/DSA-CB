import java.util.Scanner;

public class max_sum_col {
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
        max_sum_col(arr);
    }
    public static void max_sum_col(int[][] arr){
        // n*n type 2d array;
        int col=0;
        int max_sum=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++) {
            int currsum=0;
            for(int i=0;i<arr.length;i++) {
                currsum+=arr[i][j];
            }
            int tempmax=max_sum;
            max_sum=Math.max(max_sum,currsum);
            if(tempmax!=max_sum) col=j;
        }
        System.out.println(col+1+" "+max_sum);
    }
    
}
