public class armstrong_no{
    public static void main(String[] args) {
        System.out.println(armstrongg_(16784));
    }
    public static boolean armstrongg_(int n){
        int c= count(n);
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum+=(int)Math.pow(rem,c);
            n/=10;
        }
        if(temp!=sum) return false;
        return true;
    }


    public static int count(int n){
        int countt=0;
        while(n>0){
            int digi=n%10;
            countt++;
            n/=10;
        }
        return countt;
    }

}