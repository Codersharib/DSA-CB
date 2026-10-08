package Lec6;

public class majority_element {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.print(majority(arr));
    }
    public static int majority(int[] arr){
        int vote=1;
        int e=arr[0];
        for(int i=0;i<arr.length;i++){
            if(vote==0){
                e=arr[i];
            }
            if(arr[i]==e){
                vote++;
            }
            else{
                vote--;
            }
        }
        return e;
    }
}
