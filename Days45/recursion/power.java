package Days45.recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(poww(5,3));
    }
    public static int poww(int n,int i){
        if(i==0){
            return 1;
        }
        return poww(n,i-1)*n;
    }
}
