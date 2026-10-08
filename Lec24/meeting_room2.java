package Lec24;
import java.util.*;
public class meeting_room2 {
    public static void main(String[] args) {
        int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
        // display(intervals);
        // System.out.println();
        // Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        // display(intervals);
    }

    public static int meeting_room2_(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[1]-b[1]);
        pq.add(intervals[0]);
        for(int i=0;i<intervals.length;i++) {
            if(pq.peek()[1]<=intervals[i][0]){
                pq.poll();
            }
            pq.add(intervals[i]);
        }
        return pq.size();
    }

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
