public class gas_station {
    public static void main(String[] args) {
        
    }
    public static int gasStation(int gas[],int cost[]){
        int Gas=0;
        int Cost=0;
        for(int i=0;i<cost.length;i++){
            Gas+=gas[i];
            Cost+=cost[i];
        }
        if(Gas<Cost) return -1;

        // check 
        int currSum=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            currSum+=gas[i]-cost[i];
            if(currSum<0){
                currSum=0;
                start=i+1;
            }
        }
        return start;
    }
}
