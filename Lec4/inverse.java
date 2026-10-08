public class inverse {
    public static void main(String[] args) {
        System.out.print(inversee(21645));
    }
    public static int inversee(int n){
        int place =1;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=place*(int)Math.pow(10,rem-1);
            n/=10;
            place++;
        }
        return sum;
    }
}
