public class min_area_cover_all_1 {
    public static void main(String[] args) {
        int[][] grid={{0,1,0},{1,0,1}};
        int minr=Integer.MAX_VALUE;
        int maxr=Integer.MIN_VALUE;
        int minc=Integer.MAX_VALUE;
        int maxc=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==1){
                    minr=Math.min(i,minr);
                    maxr=Math.max(i,maxr);
                    minc=Math.min(j,minc);
                    maxc=Math.max(j,maxc);
                }
            }
        }
        int area=(maxr-minr+1)*(maxc-minc+1);
        System.out.print(area);
    }
}
