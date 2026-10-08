import java.util.Scanner;

public class check_prime_using_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print(" not prime");
                break;
            }
        }
        System.out.print("prime");

        // break and contiue
        int n=5;
        for(int i=1;i<n;i++){
            if(i==3) continue;
            System.out.print(i);
        }
        sc.close();
    }
}
