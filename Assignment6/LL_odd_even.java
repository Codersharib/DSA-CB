package Assignment6;

import java.util.Scanner;

public class LL_odd_even {

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Node head = null, tail = null;
        for (int num : arr) {
            Node newNode = new Node(num);
            if (head == null) {
                head = tail = newNode; 
            }else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node res=odd_eve(head);
        display(res);
    }
    public static Node odd_eve(Node root){
        if(root==null) return null;
        Node r=root;
        Node r2=root;
        Node dummy=new Node(-1);
        Node t=dummy;
        while(root.next !=null){
            if(root.next.val%2==0){
                // detach and add at last;
                r2=root;
                Node temp=root.next;
                root.next=root.next.next;
                temp.next=null;
                dummy.next=temp;
                dummy=dummy.next;
            }
            else{
                root=root.next;
            }
        }
        // handling first nddoe
        if(r.val%2==0){
            Node temp2=r;
            r=r.next;
            temp2.next=null;
            Node temp4=t.next;
            t.next=temp2;
            temp2.next=temp4;
        }
        // handling last node
        if(root.val%2==0){
            Node temp3=root;
            dummy.next=temp3;
            r2.next=t.next;
        }
        else{
            root.next=t.next;
        }
        return r;
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
