package Lec18;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.addfirst(50);
        ll.addlast(100);
        ll.addlast(200);
        ll.addlast(300);
        ll.display();
        ll.add_At_ith_index(1000, 2);
        ll.display();
    }
    
}
