package Lec19;

import java.util.*;
public class create_BT_using_level_order {
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    public create_BT_using_level_order(){
        createTree();
    }
    private void createTree(){
        Scanner sc=new Scanner(System.in);
        Queue<Node> q=new LinkedList<>();
        int item=sc.nextInt();
        Node nn=new Node(item);
        root=nn;
        q.add(nn);
        while(!q.isEmpty()){
            Node r=q.poll();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node n=new Node(c1);
                r.left=n;
                q.add(n);
            }
            if(c2!=-1){
                Node n=new Node(c2);
                r.right=n;
                q.add(n);
            }
        }
    }
}
