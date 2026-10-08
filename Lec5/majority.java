import java.util.*;
package Lec5
public class majority {
    public static void main(String[] args) {
        
    }
    Map<Integer,Integer> map=new HashMap<>();
    public  int majority_(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            
        }
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<map.get(arr[i])){
                max=map.get(arr[i]);
                ele=arr[i];
            }
        }
        return ele;
    }
}
