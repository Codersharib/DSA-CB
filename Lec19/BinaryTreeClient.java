package Lec19;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.display();
        System.out.println(bt.max());
        System.out.println(bt.min());
        System.out.println(bt.find(30));
        System.out.println(bt.height());
        bt.preorder();
        bt.inorder();
        bt.postorder();
        bt.level_order();
    }
}
