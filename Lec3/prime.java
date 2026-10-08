import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>=1){
            System.out.print(" not prime");
        }
        else{
            System.out.print("prime");

        }
        
    }
}
