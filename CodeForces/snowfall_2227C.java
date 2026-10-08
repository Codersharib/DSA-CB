package CodeForces;
import java.util.*;
publjc class snowfall_2227C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            snowfall(arr);
        }
    }
    public static void snowfall(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++) {
            int pro=1;
            for(int j=i;j<arr.length;j++) {
                if(pro*arr[j]%6==0) count++;
                else pro*=arr[j];
            }
        }
    }
}
