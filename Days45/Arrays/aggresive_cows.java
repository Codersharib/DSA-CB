    package Days45.Arrays;
    import java.util.*;
    public class aggresive_cows {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int cow=sc.nextInt();
                int[] arr=new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i]=sc.nextInt();
                }
                System.out.println(aggresive(arr,cow));
            }
        }
        public static int aggresive(int[] arr,int cow){
            Arrays.sort(arr);
            int si=1;
            int ei=arr[arr.length-1]-arr[0];
            int ans=0;
            while(si<=ei){
                int mid=si+(ei-si)/2;
                if(isValid(arr, cow, mid)){
                    si=mid+1;
                    ans=mid;
                }
                else{
                    ei=mid-1;
                }
            }
            return ans;
        }
        public static boolean isValid(int[] arr,int cow,int dis){
            int curr=arr[0];
            int c=1;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]-curr >=dis){
                    c++;
                    curr=arr[i];
                }
                if(c==cow) return true;
            }
            return false;
        }
    }
