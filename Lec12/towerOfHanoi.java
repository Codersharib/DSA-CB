package Lec12;

public class towerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        tower_of_hanoi(n, "A", "B", "C");
    }
    public static void tower_of_hanoi(int n,String src,String hlp,String des){
        if(n==0){
            return;
        }
        tower_of_hanoi(n-1, src, des, hlp);
        System.out.println("move "+n+"th disk from "+src+" to "+des);
        tower_of_hanoi(n-1, hlp, src, des);
    }
}
