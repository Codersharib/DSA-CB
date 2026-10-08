package Lec24;
import java.util.*;
public class meeting_room_3 {
    public static void main(String[] args) {
        
    }
    public static int meeting_room_3_(int[][] interval,int room){
        Arrays.sort(interval,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(interval[0]);
        for(int i=0;i<interval.length;i++) {
            if(pq.peek()[1]<=interval[i][0]){
                pq.poll();
            }
            pq.add(interval[i]);
        }
        return pq.size();
    }
}
