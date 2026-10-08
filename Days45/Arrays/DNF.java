package Days45.Arrays;

import java.util.Arrays;

public class DNF {
    public static void main(String[] args) {
        int[] arr={2, 0, 1, 2, 1, 0, 2, 0, 1};
        sort_color(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort_color(int[] arr){
        int i=0;
        int k=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==0){
                // swap
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
                i++;
            }
            else if(arr[i]==2){
                // swap i,j
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            else {
                i++;
            }
        }
    }
}
