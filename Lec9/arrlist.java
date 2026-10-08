import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>(100);
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(2);
        ll.add(3);
        ll.add(40);
        ll.add(1,-9);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
    }
}
