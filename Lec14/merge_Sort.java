public class merge_Sort {
    public static void main(String[] args) {
        int[] arr={7,5,4,3,2};
        int res[]=sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] sort(int[] arr,int si,int ei){
        if(si==ei){
            int[] a=new int[1];
            a[0]=arr[si];
            return a;
        }
        int mid=(si+ei)/2;
        int [] f=sort(arr, si, mid);
        int [] s=sort(arr, mid+1, ei);
        return merge_2_sorted_arr(f, s);
    }
    public static int[] merge_2_sorted_arr(int[] arr1,int [] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr3=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
}
