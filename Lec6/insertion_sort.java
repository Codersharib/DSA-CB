package Lec6;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={8,9,1,7,4,2,11};
        insertion(arr);
        display(arr);
    }
    public static void insertion(int[] arr){
        for(int i=0;i<arr.length;i++){
            InsertLastElement(arr,i);
        }
    }
    public static void InsertLastElement(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }
        
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
