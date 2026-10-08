package _Recursion_que_prac;

public class last_occur {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,4};
        System.out.println(lastoc(arr,arr.length-1,3));
    }
    public static int lastoc(int arr[],int i,int key){
        if(i==-1) return -1;
        if(arr[i]==key){
        return i; 
        }
        else{
            return lastoc(arr,i-1,key);
        }
    }
}
