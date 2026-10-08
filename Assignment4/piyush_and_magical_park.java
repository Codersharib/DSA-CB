import java.util.Scanner;

public class piyush_and_magical_park {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char arr[][]=new char[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                arr[i][j]=sc.next().charAt(0);
            }
        }
        can_escape(arr,s,k);
    }
    public static void can_escape(char [][] arr,int s,int k){
        if(s<=0) {
            System.out.println("No");
            return ;
        }
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(arr[i][j]=='#'){
                    break;
                }
                else if(arr[i][j]=='.'){
                    s=s-2;
                }
                else {
                    s=s+5;
                }
                if(j!=col-1){
                    s--;
                }
                if(s<=k){
                    System.out.println("No");
                    return;
                }
            }
        }
        if(s>=k){
            System.out.println("Yes");
            System.out.println(s);
        }
        else{
            System.out.println("No");

        }
    }
}
