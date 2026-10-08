package Days45;

import java.util.*;

public class first_neg_in_window_k {
    public static void main(String[] args) {
        int[] arr={1, -2, 3, 4, -5, 6, -7, 8};
        System.out.println(firstNegInt(arr, 4));
    }
    public static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        List<Integer> ll=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<k-1;i++){
            q.add(i);
        }
        for(int i=k-1;i<arr.length;i++){
            q.add(i);
            if(q.size()>k) q.poll();
            while(!q.isEmpty() && arr[q.peek()]>=0){
                q.poll();
            }
            if(q.isEmpty()){
                ll.add(0);
            }
            else{
                ll.add(arr[q.peek()]);
            }
        }
        return ll;
    }
}
