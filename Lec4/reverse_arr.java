public class reverse_arr {
    public static void main(String[] args) {
        int[] arr=new int[] {4,2,-6};
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+ " ");
        }
        reverse(arr,0,arr.length-1);
        System.out.println();
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
