import java.util.*;


public class aggressive_cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int nos=sc.nextInt();
            int noc=sc.nextInt();
            int stall[]=new int[nos];
            for(int i=0;i<nos;i++){
                stall[i]=sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largest_min(stall,noc));

        }
    }
    public static int  largest_min(int stall[],int noc){
        int h=stall[stall.length-1]-stall[0];
        int l=1;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(ifisPossible(stall,noc,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    public static boolean ifisPossible(int stall[],int noc,int mid){
        int cow=1;
        int pos=stall[0];
        for(int i=1;i<stall.length;i++){
            if((stall[i]-pos)>=mid){
                cow++;
                pos=stall[i];
            }
            if(noc==cow){
                return true;
            }
        }
        return false;
        
    }


}
