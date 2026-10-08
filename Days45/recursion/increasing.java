package Days45.recursion;

public class increasing {
    public static void main(String[] args) {
        incr(5);
    }
    public static void incr(int n){
        if(n==0){
            return ;
        }
        incr(n-1);
        System.out.println(n);
    }
}
