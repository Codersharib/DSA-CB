    import java.util.*;
    public class book_allocation_problem {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int n=sc.nextInt();
                int stu=sc.nextInt();
                int arr[]=new int[n];
                for(int j=0;j<n;j++){
                    arr[j]=sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(book_allocation(arr,stu));

            }
        }
        public static int book_allocation(int[] arr,int stu){
            int l=arr[arr.length-1];
            int h=0;
            int ans=0;
            for(int i=0;i<arr.length;i++){
                h+=arr[i];
            }
            while(l<=h){
                int mid=l+(h-l)/2;
                if(isValid(arr,mid,stu)){
                    ans=mid;
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }

            }
            return ans;
            
        }

        public static boolean isValid(int arr[],int pages,int stu){
            int count_Stu=0;
            int i=0;
            while(i<arr.length){
                int currsum=0;
                while(i<arr.length && arr[i]+currsum<=pages){
                    currsum+=arr[i];
                    i++;
                }
                count_Stu++;
                currsum=0;
            }
            if(count_Stu<=stu) return true;
            else return false;
        }
    }
