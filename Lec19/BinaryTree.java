package Lec19;

import java.util.*;

public class BinaryTree {
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public BinaryTree(){
        root=createTree();
    }
    private Node createTree(){
        int item=sc.nextInt();
        Node nn=new Node(item);
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=createTree();
        }
        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=createTree();
        }
        return nn;
    }
    public void display(){
        display(root);
    }
    private void display(Node nn){
        if(nn==null) return;
        String s="<--"+nn.val+"-->";
        if(nn.left!=null){
            s=nn.left.val+s;
        }
        else{
            s="."+s;
        }
        if(nn.right!=null){
            s=s+nn.right.val;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        display(nn.left);
        display(nn.right);
    }
    // que
    public int max(){
        return max(root);
    }
    private int max(Node node){
        if(node ==null) return Integer.MIN_VALUE;
        int left_max=max(node.left);
        int right_max=max(node.right);
        return Math.max(node.val,Math.max(left_max,right_max));
    }
    // que
    public int min(){
        return min(root);
    }
    private int min(Node node){
        if(node ==null) return Integer.MAX_VALUE;
        int left_min=min(node.left);
        int right_min=min(node.right);
        return Math.min(node.val,Math.min(left_min,right_min));
    }
    // que
    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node node,int item){
        if(node ==null) return false;
        if(node.val==item){
            return true;
        }
        boolean left=find(node.left,item);
        boolean right=find(node.right,item);
        return left|| right;
    }
    // que
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node ==null) return -1;
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
    // que
    public void preorder(){
        preorder(this.root);
        System.out.println();
    }
    private void preorder(Node node){
        if(node ==null) return;
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
    // que
    public void inorder(){
        inorder(this.root);
        System.out.println();
    }
    private void inorder(Node node){
        if(node ==null) return;
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }
    // que
    public void postorder(){
        postorder(this.root);
        System.out.println();
    }
    private void postorder(Node node){
        if(node ==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");
    }
    // que
    public void level_order(){
         level_order(root);
    }
    public void level_order(Node node){
        Queue<Node> q= new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node r=q.poll(); // remove
            System.out.print(r.val+" ");
            if(r.left!=null){
                q.add(r.left);
            }
            if(r.right!=null){
                q.add(r.right);
            }
        }
        System.out.println();
    }
}
