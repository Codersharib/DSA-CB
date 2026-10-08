import java.util.*;
public class CB_no {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            // String str="127";
            System.out.print(CB__num(str));
    }
    public static int CB__num(String s){
        int count=0;
        boolean[] visited=new boolean[s.length()];
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++) {
                int i=j-len;
                long num=Long.parseLong(s.substring(i,j));
                if(iscb_num(num) && isvisited(visited,i,j-1)){
                    count++;
                    for(int k=i;k<j;k++){
                        visited[k]=true;
                    }
                }
            }
        }
        return count;
    }
    public static boolean isvisited(boolean[] visited,int si,int ei){
        for(int i=si;i<=ei;i++){
            if(visited[i]==true) return false;
        }
        return true;
    }
    public static boolean iscb_num(long n){
        if( n==0 || n==1) return false;
        int arr[]={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++){
            if(n==arr[i])  return true;
        }
        for(int i=0;i<arr.length;i++){
            if(n%arr[i]==0) return false;
        }
        return true;
    }
}
