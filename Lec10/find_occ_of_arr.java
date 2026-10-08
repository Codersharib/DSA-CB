package Lec10;

public class find_occ_of_arr {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4};
        int item=4;
        System.out.println(occur(arr,item,0));
    }
    public static int occur(int[] arr,int item,int i){
        if(i==arr.length) return -1;
        if(arr[i]==item) return i;
        return occur(arr,item,i+1);
    }
}
