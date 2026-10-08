public class wave_print_col_wise {
    public static void main(String[] args) {
        int[][] arr={{2,3,1,4},{5,6,7,8},{10,11,12,13}};
        print(arr);
    }
    public static void print(int[][]arr){
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }
                else{
                    System.out.print(arr[arr.length-j-1][i]+" ");
                    
                }
            }
            // System.out.println();
        }
    }
}
