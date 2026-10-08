package Lec13;

public class merge_2_sorted_Array {
    public static void main(String[] args) {
        int arr1[]={2,3,5,7,9,11,13};
        int arr2[]={1,4,6,8,10,12,14};
        int[] merged=merge(arr1,arr2);
        for(int i=0;i<merged.length;i++) {
            System.out.print(merged[i]+" ");
        }

    }
    public static int[] merge(int[] arr1,int [] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr3=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
    
}
