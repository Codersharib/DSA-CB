import java.util.Scanner;

public class search_2d_Arr {
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
        int target=sc.nextInt();
        System.out.print(search2d(arr,target));
    }
    public static int search2d(int [][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(  ){
            if(arr[row][col]==target) return 1;
            else if(arr[row][col]<target) row++;
            else col--;
        }
        return 0;
    }
}
