import java.util.Scanner;

public class rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char maze[][]=new char[n][m];
        for(int i=0;i<maze.length;i++) {
            String s=sc.next();
            for(int j=0;j<s.length();j++) {
                maze[i][j]=s.charAt(j);
            }
        }
        int[][] ans=new int[n][m];
        path(maze, 0, 0,ans);
        if(val==1){
            System.out.println("NO PATH FOUND");
        }
    }
    static int val=1;
    public static void path(char [][] maze,int cr,int cc,int [][] ans){
        if(cr<0 ||cc<0 ||cr>=maze.length ||cc>=maze[0].length || maze[cr][cc]=='X') return;
        if(cr==maze.length-1 && cc==maze[0].length-1){
            ans[cr][cc]=1;
            display(ans);
            val=0;
            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        int[] r={-1,0,1,0};
        int[] c={0,-1,0,1};
        for(int i=0;i<c.length;i++) {
            path(maze, cr+r[i], cc+c[i], ans);
        }
        // path(maze, cr-1, cc,ans); //up
        // path(maze, cr, cc-1,ans); //left
        // path(maze, cr+1, cc,ans); //down
        // path(maze, cr, cc+1,ans); //right
        maze[cr][cc]='O';
        ans[cr][cc]=0;
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
