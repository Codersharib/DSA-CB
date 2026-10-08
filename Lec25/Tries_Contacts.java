package Lec25;

public class Tries_Contacts {
    class Node {

        char ch;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isTerminal;
        int count=1;

        public Node(char ch) {
            this.ch = ch;
        }
    }
    private Node root;

    public Tries_Contacts() {
        root = new Node('*');
    }
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
                curr.count++;
            } else {
                Node nn = new Node(ch);
                curr.child.put(ch, nn);
                curr=nn;
            }
        }
        curr.isTerminal = true;
    }
    public int search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
            } else {
                return 0;
            }
        }
        return curr.count;
    }
    public static void main(String[] args) {
        Tries_Contacts t=new Tries_Contacts();
        
    }
}
