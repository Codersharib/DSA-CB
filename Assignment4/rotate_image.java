import java.util.Scanner;

public class rotate_image {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        rotate_90_anticlock(arr);
        display(arr);
    }
    
    public static void rotate_90_anticlock(int[][] arr){
        int n=arr.length;
        Transpose(arr);
        for(int j=0;j<n;j++) {
            int i=0;
            int temp_n=n-1;
            while(i<temp_n){
                int temp=arr[i][j];
                arr[i][j]=arr[temp_n][j];
                arr[temp_n][j]=temp;
                i++;
                temp_n--;
            }
        }
    }
    public static void Transpose(int [][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(i==j) continue;
                else{
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
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
