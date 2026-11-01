    package Days45.Backtracking;

    import java.util.HashMap;

    public class ThreeSum {
        public static void main(String[] args) {
            int[] nums={-1,0,1,2,-1,-4};
            int target=0;
            int[] res=Twosum(nums);
            System.out.println();
            // System.out.print(res[0]+" "+ res[1]+" "+ res[2]);

        }
        public static int[] Twosum(int[] arr){
            HashMap<Integer,Integer> map=new HashMap<>();
            int[] ans=new int[3];
            int sum=0;
            for (int j = 0; j < ans.length-1; j++) {
                sum+=arr[j];
                for (int i = j+1; i < arr.length; i++) {
                    sum+=arr[i];
                    if((sum<0 && map.containsKey(-sum)) || (sum>0 && map.containsKey(sum))){
                        if(sum<0){
                            ans[0]=map.get(-sum);
                        }
                        else{
                            ans[0]=map.get(sum);
                        }
                        ans[1]=arr[i];
                        ans[2]=arr[j];
                        System.out.print(ans[0]+" "+ ans[1]+" "+ ans[2]);
                        System.out.println();
                    }
                    
                    else{
                        map.put(arr[i],i);
                    }
                }
            }
            return ans;
        }
    }
