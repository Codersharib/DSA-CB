public class search_max {
    public static void main(String[] args) {
        int[] arr=new int[] {3,5,6,2,4,16,7,8,9};
        System.out.println(max_(arr));
    }
    public static int max_(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
}
