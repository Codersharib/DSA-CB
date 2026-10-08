package _Recursion_que_prac;

public class count_zeros {
    public static void main(String[] args) {
        System.out.println(countZeros(1208034));
    }
    public static int countZeros(int n){
        if(n==0) return 0;
        int digit=n%10;
        if(digit==0){
            return 1+countZeros(n/10);
            
        }
        else{
            return countZeros(n/10);

        }
    }
}
