public class BtoD {
    public static void main(String[] args) {
        int num=101101;
        int sum=0;
        int i=1;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*i;
            i*=2;
            num/=10;
        }
        System.out.println(sum);
    }
}
