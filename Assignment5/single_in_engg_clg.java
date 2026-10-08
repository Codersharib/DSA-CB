package Assignment6;

import java.util.Scanner;

public class single_in_engg_clg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int wood=sc.nextInt();
        System.out.println(maxLength_of_cutter(arr,wood,max));
    }
    public static int maxLength_of_cutter(int[] arr,int wood,int max){
        int l=0;
        int h=max;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(arr,wood,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr,int wood,int max_ht){
        long c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max_ht){
                c+=arr[i]-max_ht;
            }
        }
        if(c>=wood) return true;
        else return false;
    }
}
