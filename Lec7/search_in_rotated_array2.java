public class search_in_rotated_array2 {
    public static void main(String[] args) {
        
    }
    public static boolean search(int arr[],int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]==arr[l] && arr[mid]==arr[h]){
                l++;
                h--;
            }
            else if(arr[l]<=arr[mid]){
                if(target>=arr[l] && target<arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(target<=arr[h] && target>arr[mid]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }

            }
        }
        return false;
    }
}
