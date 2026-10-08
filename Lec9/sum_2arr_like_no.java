import java.util.ArrayList;
import java.util.Collections;
public class sum_2arr_like_no {
    public static void main(String[] args) {
        int arr1[]={1,0,2,9};
        int arr3[]={3,4,5,6,7};
        add_Arr_like_no(arr1,arr3);

    }
    public static void add_Arr_like_no(int arr1[],int arr2[]){
        int i=arr1.length-1;
        int j=arr2.length-1;
        ArrayList<Integer> ll=new ArrayList<>();
        int carry=0;
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            ll.add(sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry>0){
            ll.add(carry);
        }
        Collections.reverse(ll);
        for(int num:ll){
            System.out.print(num+", ");
        }
        System.out.print("END");
    }
}
