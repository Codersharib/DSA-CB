package Lec31;

public class magic_no {
    public static void main(String[] args) {
        int n=10;
        int ans=0;
        int mul=5;
        while(n>0){
            if((n&1)!=0){
                ans=ans+mul;
            }
            mul=mul*5;
            n>>=1; // n=n>>1
        }
        System.out.println(ans);
    }
}
