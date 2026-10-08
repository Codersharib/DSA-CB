public class pascle_tri_from_prev_class {
    public static void main(String[] args) {
        // check classnote for understanding
        int n=4;
        int row=0;
        int star=1;
        while(row<=n){
            // star
            int i=0;
            int ncr=1;
            while(i<star){
                System.out.print(ncr+" ");
                ncr=((row-i)*ncr)/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println("");
        }
    }
}
