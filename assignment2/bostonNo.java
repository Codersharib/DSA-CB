import java.util.*;
public class bostonNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(boston(n));
        // System.out.println(prime_factor_sum(n));
    }
    public static int boston(int n){
        if(isPrime(n)) return 0;
        int prime_sum=prime_factor_sum(n);
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        if(prime_sum!=sum){
            return 0;
        }
        return 1;
    }


    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int prime_factor_sum(int n){
        int sum=0;
        int divisor=2;
        while(n>1){
            if(n%divisor==0){
                if(divisor>9){
                    int temp=divisor;
                    int temp_sum=0;
                    while(temp>0){
                        int temp_rem=temp%10;
                        temp_sum+=temp_rem;
                        temp/=10;
                    }
                    sum+=temp_sum;
                }
                else{
                    sum+=divisor;

                }
                n/=divisor;
            }
            else{
                divisor++;
            }
        }
        return sum;
    }
}
