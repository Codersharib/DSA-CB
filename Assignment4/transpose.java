import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        Transpose(arr);
        display(arr);
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
