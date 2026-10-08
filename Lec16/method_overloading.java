package Lec16;

public class method_overloading {
    public static void main(String[] args) {
        System.out.println(add(3,8));
        System.out.println(add(3,8,11));
        System.out.println(add(3,8,7.9));
        System.out.println(add(2,5,6,7,7,6,5));
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static int add(int x,int y,double z){
        return (int) (x+y+z);
    }
    //  and below type of fun can only be creaeted once in the class
    public static int add(int p,int ...a){ // this type of parameter one can be created and in last 
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        return sum+p;
    }
}
