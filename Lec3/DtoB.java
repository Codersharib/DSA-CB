public class DtoB {
    public static void main(String[] args) {
        int num=49;
        int sum=0;
        int i=1;
        while(num>0){
            int rem=num%2;
            sum=sum+rem*i;
            i*=10;
            num/=2;
        }
        System.out.println(sum);
    }
}
