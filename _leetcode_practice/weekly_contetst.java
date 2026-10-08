package _leetcode_practice;

public class weekly_contetst {
    public static void main(String[] args) {
        System.out.println(max_valid(2,4,3));
    }
    public static long max_valid(int n,int s,int m){
        if(n==1) return s;
        long [] arr=new long[n];
        arr[0]=s;
        for(int i=1;i<n;i++){
            if(i%2==1){
                arr[i]=arr[i-1]+m;
            }
            else{
                arr[i]=arr[i-1]-1;
            }
        }
        return arr[n-1];
    }
}
