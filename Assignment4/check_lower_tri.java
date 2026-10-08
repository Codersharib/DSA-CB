import java.util.Scanner;

public class check_lower_tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        isLowerTri(arr);
    }
    public static boolean isLowerTri(int [][] arr){
        int n=arr.length;
        for(int j=0;j<n;j++) {
            // for(int i=j;i<n;i++) {
            //     if(arr[i][j]==0) return false;
            // }
            for(int i=0;i<j;i++) {
                if(arr[i][j]!=0) return false;
            }
        }
        return true;
    }
}
