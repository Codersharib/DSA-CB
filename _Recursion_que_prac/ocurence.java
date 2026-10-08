package _Recursion_que_prac;

public class ocurence {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,4,4,4,4};
        System.out.println(oc(arr, 4,0));
    }
    public static int oc(int arr[],int key,int i){
        if(arr.length==i) return 0;
        if(arr[i]==key){
        return 1+oc(arr,key,i+1); 
        }
        else{
            return oc(arr,key,i+1);
        }
    }
}
