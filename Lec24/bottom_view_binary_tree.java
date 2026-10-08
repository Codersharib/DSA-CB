package Lec24;

import java.util.*;

public class bottom_view_binary_tree {

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

    public static  List<Integer> BottomView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<NodePair> q = new LinkedList<>();
        q.add(new NodePair(root, 0));
        while (!q.isEmpty()) {
            NodePair r = q.poll();
            map.put(r.vt, r.node.val);
            if (r.node.left != null) {
                q.add(new NodePair(r.node.left, r.vt - 1));
            }
            if (r.node.right != null) {
                q.add(new NodePair(r.node.right, r.vt + 1));
            }
        }
        List<Integer> ll = new ArrayList<>();
        for (int x : map.keySet()) {
            ll.add(map.get(x));
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
        TreeNode root=new TreeNode();
        List<Integer> ll = new ArrayList<>();
        System.out.println(BottomView(root));
    }
}
