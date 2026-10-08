import java.util.*;

public class max_ele_after_re_dec {
    public static void main(String[] args) {
        int []arr = {2,2,2,2,2,2,2,2,2,2,2};
        System.out.println(re_dec(arr));
    }
    public static int re_dec(int[] arr){
        Arrays.sort(arr);
        if(arr[0]!=1) arr[0]=1;
        for(int i=1;i<arr.length;i++){
            
            if(Math.abs(arr[i]-arr[i-1])>1){
                arr[i]=i+1;
            }
        }
        return arr[arr.length-1];
    }
}
