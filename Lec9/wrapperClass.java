import java.util.*;
public class wrapperClass {
    public static void main(String[] args) {
        // booom
        Integer c1=19;
        Integer c2=19;
        Integer c3=190;
        Integer c4=190;
        System.out.println(c1==c2);
        System.out.println(c3==c4);
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(10);
        ll.add(20);
        System.out.print(ll);
        ll.add(1,-9);
        System.out.print(ll);
    }
}
