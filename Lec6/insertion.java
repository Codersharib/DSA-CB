package Lec6;

public class insertion {
    public static void main(String[] args) {
        int[] arr={1,2,7,8,9,11,0};
        InsertLastElement(arr,arr.length-1);
        display(arr);
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
