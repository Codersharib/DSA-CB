package _prac;

import java.util.*;
public class level_order {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Write your level order traversal here
        levelOrder(root);
    }

    public static void levelOrder(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node r=q.poll();
            System.out.println(r.val+" ");
            Node l=(r.left);
            Node ri=(r.right);
            if(l!=null){
                q.add(l);
            }
            if(ri!=null){
                q.add(ri);
            }
        }
        System.out.println();
    }
}

