package Lec5;

public class GasStation {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.print(gasStation(gas,cost));
    }
    public static int gasStation(int[] gas,int[] cost){
        int n=gas.length;
        int start=check_start(gas,cost,0);
        if( start==-1) return -1;
        // start gas filled gas[start]
        int fuel=0;
        int count=0;
        int i=start;
        while(count<n){
            // check fuel
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                // again start
                start=check_start(gas,cost,0);
                if(start==-1) return -1;
                i=start;
                fuel=0;
                count=0;
            }
            
            else{
                i=(i+1)%n;
                count++;
            }
            if(count==n) return start;
        }
        return start;
    }
    public static int check_start(int[] gas, int[] cost,int iteration){
        for(int i=iteration;i<gas.length;i++){
            if(gas[i]>=cost[i]) return i;
            
        }
        return -1;

    }
}
