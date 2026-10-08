package Lec23;

import java.util.*;

public class busyman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pair[] arr=new pair[n];
        for(int i=0;i<arr.length;i++) {
            int st=sc.nextInt();
            int et=sc.nextInt();
            arr[i]=new pair(st,et);
        }
        Arrays.sort(arr,(a,b)->a.et-b.et);
        int activity=1;
        int end=arr[0].et;
        for(int i=1;i<arr.length;i++) {
          if(arr[i].st>=end){
            activity++;
            end=arr[i].et;
          }  
        }
        System.out.println(activity);
    }
    static class pair{
        int st;
        int et;
        public pair(int st,int et){
            this.st=st;
            this.et=et;
        }
    }
}
