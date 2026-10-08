
import java.util.Scanner;

public class shopping_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int M=sc.nextInt();
            int N=sc.nextInt();
            int res=winner(M,N);
            if(res==1) {
                System.out.println("Aayush");
            }
            else{
                System.out.println("Harshit");
            }
        }
    }
    public static int  winner(int M,int N){
        int A_sum=1;
        int H_sum=2;
        while(true){
            if(A_sum>M && H_sum<=N) return 2;
            if(A_sum<=M && H_sum>N) return 1;
            A_sum+=2;
            H_sum+=2;
        }
        
    }
}
