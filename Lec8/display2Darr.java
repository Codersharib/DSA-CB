public class display2Darr {
    public static void main(String[] args) {
        int arr[][]=new int[][]{};
        display(arr);
    }
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
