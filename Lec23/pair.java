package Lec23;

public class pair<T,P> {
    T x;
    P y;
    public pair(){

    }
    public pair(T x, P y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        pair<Integer,Boolean> p1=new pair<>();
        pair<Character,String> p2=new pair<>();
    }
}
