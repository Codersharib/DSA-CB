package Lec24;

import java.util.*;

public class top_view_BT {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> top_view(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        if(root==null) return ll;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<NodePair> q=new LinkedList<>();
        q.add(new NodePair(root, 0));
        while(!q.isEmpty()){
            NodePair r=q.poll();
            if(!map.containsKey(r.vt)){
                map.put(r.vt,r.node.val);
            }
            // map.put(r.vt,r.node.val);
            if(r.node.left!=null){
                q.add(new NodePair(r.node.left, r.vt-1));
            }
            if(r.node.right!=null){
                q.add(new NodePair(r.node.right, r.vt+1));
            }
        }
        for (int key : map.keySet()) {
            ll.add(map.get(key));
        }
        return ll;
    }

    public static class NodePair {

        TreeNode node;
        int vt;

        public NodePair(TreeNode node, int vt) {
            this.node = node;
            this.vt = vt;
        }
    }

    public static void main(String[] args) {
        //         20
        //        /  \
        //       8    22
        //      / \     \
        //     5   3    25
        //        / \
        //       10  14

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        System.out.println("top view: " + top_view(root));
        // Expected: [5, 10, 3, 14, 25]  (or [5, 10, 14, 25] depending on how ties at same column are broken)
    }
}