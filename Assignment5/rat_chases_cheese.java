package Assignment6;

import java.util.Scanner;

public class rat_chases_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        char grid[][]=new char[n][m]; 
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            for(int j=0;j<m;j++) {
                grid[i][j]=s.charAt(j);
            }
        }
        rat_chase(arr, grid, 0, 0);
        if(!f){ 
            System.out.println("NO PATH FOUND");
        }
    }
    static boolean f=false;
    public static void rat_chase(int[][] arr,char[][] grid,int cr,int cc){
        if(cr<0 || cc<0 ||cr>=grid.length || cc>=grid[0].length|| grid[cr][cc]=='X') return;
        if(cr==grid.length-1 && cc==grid[0].length-1){
            arr[cr][cc]=1;
            display(arr);
            f=true;
            return;
        }
        grid[cr][cc]='X';
        arr[cr][cc]=1;
        int[] r={0,0,1,-1};
        int[] c={1,-1,0,0};
        for(int i=0;i<r.length;i++) {
            rat_chase(arr, grid, cr+r[i], cc+c[i]);
        }
        // rat_chase(arr, grid, cr, cc-1);//left
        // rat_chase(arr, grid, cr+1, cc);//down
        // rat_chase(arr, grid, cr, cc+1);//right
        // rat_chase(arr, grid, cr-1, cc);//up
        arr[cr][cc]=0;
        grid[cr][cc]='O';
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
