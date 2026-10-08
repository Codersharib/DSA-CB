package Days45;
import java.util.*;
public class no_of_valid_subarrays {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        System.out.println(NGE_similar_from_back(arr));
    }
    public static int NGE_similar_from_back(int[] arr){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            int ei=arr.length;
            if(!st.isEmpty()) ei=st.peek();
            ans +=ei-i;
            st.push(i);
        }
        return ans ;
    }
}
