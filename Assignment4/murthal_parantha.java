import java.util.Arrays;
import java.util.Scanner;

public class murthal_parantha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(murthal_prantha(arr,p));
    }
    public static int murthal_prantha(int arr[],int p){
        int l=1;
        int h=arr[0]*p*(p+1)/2; //n(n+1)/2
        int min_time=h;
        while(l<=h){
            int mid=l+(h-l)/2;
            // int min_ti=canMake(arr,mid,p);
            if(canMake(arr,mid,p)){
                min_time=mid;
                h=mid-1;

            }
            else{
                l=mid+1;
            }
        }
        return min_time;
    }
    public static boolean canMake(int arr[],int time,int p){
        int time_max=Integer.MIN_VALUE;
        int sum_pr=0;
        for(int i=0;i<arr.length;i++) {
            int mul=1;
            int sum_time=0;
            while(time>=sum_time+arr[i]*mul){
                // make parantha;
                sum_time+=arr[i]*mul;
                mul++;
                sum_pr++;
            }
            time_max=Math.max(time_max,sum_time);
        }
        if(sum_pr<p) return false;
        else return true;
    }
}
