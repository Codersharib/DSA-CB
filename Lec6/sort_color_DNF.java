package Lec6;

public class sort_color_DNF {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        DNF(arr);
        display(arr);
     }
    public static void DNF(int arr[]){
        int zero=0;
        int two=arr.length-1;
        int i=0;
        while(i<=two){
            if(arr[i]==0){
                int temp=arr[zero];
                arr[zero]=arr[i];
                arr[i]=temp;
                zero++;
                i++;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                int temp=arr[two];
                arr[two]=arr[i];
                arr[i]=temp;
                two--;
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
