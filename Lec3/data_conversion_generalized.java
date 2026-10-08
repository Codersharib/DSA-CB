import java.util.Scanner;

public class data_conversion_generalized {
    // public static void main(String[] args) {
    //     int num=101101;
    //     int sum=0;
    //     int multiplier=1;
    //     int des=10;
    //     int src=2;
    //     while(num>0){
    //         int rem=num%des;
    //         sum=sum+rem*multiplier;
    //         multiplier*=src;
    //         num/=des;
    //     }
    //     System.out.println(sum);
    // }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int des=sc.nextInt();
        int src=sc.nextInt();
        if(src!=10 && des !=10){
            int first=conversion(src,10,n);
            int second=conversion(10,des,first);
            System.out.println(second);

        }
        else{
            System.out.println(conversion(src,des,n));

        }
    }
    public static int conversion(int src,int des,int n){
        int sum=0;
        int multiplier=1;
        while(n>0){
            int rem=n%des;
            sum+= rem*multiplier;
            multiplier*=src;
            n/=des;
        }
        return sum;
    }
}
