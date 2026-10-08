public class wave_print_row_wise {
    public static void main(String[] args) {
        int[][] arr={{2,3,1,4},{5,6,7,8},{10,11,12,13}};
        print(arr);
        
    }
    public static void print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(arr[i][arr.length-j]+" ");
                    
                }
            }
            // System.out.println();
        }
    }
}
