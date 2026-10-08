package Lec12;

public class sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n=188;
        System.out.println(prime_Sieve(n));
    }
    public static int prime_Sieve(int n){
        int[] prime=new int[n];
        prime[0]=1; //non prime
        prime[1]=1;  //non prime
        for(int i=2;i*i<=prime.length;i++){
            if(prime[i]==0){ // ith is prime
                for(int j=2;i*j<prime.length;j++) {
                    prime[i*j]=1;
                }
            }
        }
        int c=0;
        for(int i=2;i<prime.length;i++) {
            if(prime[i]==0) c++;
        }
        return c;
    }
}
