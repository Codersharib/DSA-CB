import java.util.*;
public class majority_ele_II {
    public static void main(String[] args) {
        
    }
    public static List moore_voting(int arr[]){
        int count1=0, count2=0;
        int cand1=0, cand2=0;
        for(int i=0;i<arr.length;i++){
            // curr element is equal to candidate
            if(arr[i]==cand1 && count1>0){
                count1++;
            }
            else if(arr[i]==cand2 && count2>0){
                count2++;
            }
            // check if count ==0 make that curr element as new begining
            else if(count1==0){
                cand1=arr[i];
                count1++;
            }
            else if(count2==0){
                cand2=arr[i];
                count2++;
            }
            // else its other element means redcuign the no of count
            else{
                count1--;
                count2--;
            }
        }
        // get actual count
        count1=0;
        count2=0;
        for(int num:arr){
            if(num==cand1) count1++;
            else if(num==cand2) count2++;
        }
        List<Integer> list=new ArrayList<>();
        if(count1>arr.length/3) list.add(cand1);
        if(count2>arr.length/3) list.add(cand2);
        return list;
    }
}
