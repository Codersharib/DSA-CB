public class remove_element {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        System.out.println(remove(arr, 2));
    }
    public static int remove(int arr[],int key){
        int k=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=key){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
