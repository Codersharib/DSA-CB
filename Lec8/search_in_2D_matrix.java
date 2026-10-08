public class search_in_2D_matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
        int target=21;
        long start=System.currentTimeMillis();
        System.out.println(stair_case_search(matrix, target));
        long end=System.currentTimeMillis();
        System.out.println(end -start);
        
    }
    public static boolean stair_case_search(int matrix[][],int target){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
