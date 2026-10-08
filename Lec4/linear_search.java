public class linear_search {
    public static void main(String[] args) {
        int[] arr=new int[] {3,5,7,1,8};
        System.out.println(linear(arr,9));
    }
    public static int linear(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }
}
