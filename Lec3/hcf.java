public class hcf {
    public static void main(String[] args) {
        int dividend=517379;
        int divisor=59;
        while(dividend%divisor !=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
