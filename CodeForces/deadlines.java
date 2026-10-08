package CodeForces;
import java.util.*;
public class deadlines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(deadline(arr));
        }
    }
    public static int deadline(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++) {
            for(int i=arr.length-1;i>=0;i--) {
                if(i-j>Math.max(arr[i],arr[j])){
                    max=Math.max(max,arr[i]+arr[j]);
                }
            }
        }
        int max2=Integer.MIN_VALUE;
        if(max< -1000000){
            for(int i=0;i<arr.length;i++) {
                if(max2<arr[i]){
                    max2=arr[i];
                }
            }
            return max2;
        }
        else{
            return max;
        }
    }
}
