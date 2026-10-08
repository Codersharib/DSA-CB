public class digi_sum {
    public static void main(String[] args) {
        int n=373938302;
        int sum=0;
        while(n>0){
            int digi=n%10;
            sum+=digi;
            n/=10;
        }

        System.out.println(sum);
    }
}
