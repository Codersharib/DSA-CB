import java.util.Scanner;

public class replace {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        zero_five(n);
    }
    public static void zero_five(int n){
        int num=0;
        int mul=1;
        if(n==0){
            System.out.print(5);
            return ;
        }
        while(n>0){
            int rem=n%10;
            if(rem==0){
                rem=5;
            }
            num=num+rem*mul;
            mul*=10;
            n/=10;
        }
        System.out.print(num);
    }
}
