package Lec18;

public class LinkedList {
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    // add at first O(1)
    public void addfirst(int x){
        Node nn=new Node(x);
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    private Node getNode(int k){
        Node temp=head;
        for(int i=0;i<k;i++) {
            temp=temp.next;
        }
        return temp;
    }
    // addlast
    public void addlast(int x){
        if(size==0){
            addfirst(x);
        }
        else{
            Node nn=new Node(x);
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    // addAtIndex
    public void add_At_ith_index(int x,int index){
        if(index==0){
            addfirst(x);
        }else if(index==size){
            addlast(x);
        }
        else{
            Node ptr=new Node(x);
            Node prev=getNode(index-1);
            ptr.next=prev.next;
            prev.next=ptr;
        }
    }
    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.val+"-->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    // getfirst
    public int getfirst(){
        return head.val;
    }
    // getlast
    public int getlast(){
        return tail.val;
    }
    // get at ith index
    public int getatindex(int k){
        return getNode(k).val;
    }
    public int size(){
        return size;
    }
    // remove first
    public int removefirst(){
        Node ptr=head;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            ptr.next=null;
        }
        size--;
        return ptr.val;
    }
    // remove last
    public int removelast(){
        if(size==1){
            return removefirst();
        }
        else{
            int val=tail.val;
            Node prev=getNode(size-2);
            tail=prev;
            prev.next=null;
            size--;
            return val;
        }
    }
    // remove ith index
    public int remove_At_index(int k){
        if(size==0){
            return removefirst();
        }
        else if(k==size-1){
            return removelast();
        }
        else{
            Node prev=getNode(k-1);
            Node curr=prev.next;
            int val=curr.val;
            prev.next=curr.next;
            curr.next=null;
            size--;
            return val;
        }
    }
}
