package Days45.Arrays;

public class majority_element {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    public static int majority(int [] arr){
        int vote=0;
        int e=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(vote==0){
                e=arr[i];
            }
            if(e==arr[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        return e;
    }
}
