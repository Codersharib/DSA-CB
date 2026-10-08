package Lec9;

public class substring_charwise {
    public static void main(String[] args) {
        String s="coding";
        print(s);
    }
    public static void print(String s){
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++) {
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
            System.out.println();
        }
    }
}
