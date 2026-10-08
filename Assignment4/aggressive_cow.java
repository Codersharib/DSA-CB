import java.util.*;
public class aggressive_cow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cow=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(agg_cows(arr,cow));
    }
    public static int agg_cows(int arr[],int ncow){
        int l=1;
        int h=arr[arr.length-1];
        int max=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(canSit(arr, mid, ncow)){
                max=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return max;
    }
    public static boolean canSit(int arr[],int k,int ncow){
        int cow=1;
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            
            int dif=arr[i]-curr;
            if(dif>=k){
                cow++;
                curr=arr[i];
            }
            if(cow==ncow) return true;
            
        }
        return false;
    }
}
