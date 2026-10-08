package Assignment5;

import java.util.*;

public class subset {
    static boolean first = true;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<Integer> curr=new ArrayList<>();
        print(arr, target, arr.length-1,curr,0);
        if (!first) System.out.print("\n");
        System.out.println(print_c(arr, target, arr.length-1, 0));
    }
    public static void print(int[] arr,int target,int i,List<Integer> curr,int sum){
        if(i==-1 ){
            if(sum==target){
                if (!first) System.out.print("  ");
                first = false;
                for (int j = curr.size() - 1; j >= 0; j--) {
                    System.out.print(curr.get(j));
                    if (j != 0) System.out.print(" ");
                }
            }
            return;
        }
        print(arr, target,i-1,curr,sum);
        sum+=arr[i];
        curr.add(arr[i]);
        print(arr, target,i-1,curr,sum);
        curr.remove(curr.size()-1);
    }
    public static int print_c(int[] arr,int target,int i,int sum){
        if(i==-1 ){
            return sum==target? 1:0;
        }
        int include=print_c(arr, target,i-1,sum);
        int exclude=print_c(arr, target,i-1,sum+arr[i]);
        return include+exclude;
    }
}
