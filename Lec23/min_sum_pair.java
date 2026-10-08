package Lec23;

import java.util.PriorityQueue;

public class min_sum_pair {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3,4};
        System.out.println(Min_sum(arr));
    }
    public static int Min_sum(int[] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            sum+=a+b;
            pq.add(a+b);
        }
        return sum;
    }
}
