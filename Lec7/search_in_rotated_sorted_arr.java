public class search_in_rotated_sorted_arr {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.print(search1(arr,target));
    }
    public static int search1(int arr[],int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            // mid upper line pr hai
            if(arr[mid]>=arr[l]){
                if(arr[mid]>target && arr[l]<=target){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            // mid lower line pr hai
            else{
                if(arr[h]>=target && target>arr[mid]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            
        }
        return -1;
    }
}
