package Assignment6;

import java.util.Scanner;

public class celebrity_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        celebrity(arr);
    }
    public static void celebrity(int[][] arr){
        int ans=-1;
        for (int j=0;j<arr.length;j++) {
            boolean contains=false;
            for (int i = 0; i < arr[0].length; i++) {
                if(arr[j][i]==1) contains=true;
            }
            if(contains==false) ans=j;
        }
        if(ans==-1){
            System.out.println("No Celebrity");
        }
        else{
            System.out.println(ans);
        }
    }
}
