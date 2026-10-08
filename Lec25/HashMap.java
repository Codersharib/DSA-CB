package Lec25;

import java.util.ArrayList;

public class HashMap<K,V> {
    class Node{
        K key;
        V value;
        Node next;
        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    private ArrayList<Node> list;
    private int size=0;
    public HashMap(){
        this(4);
    }
    public HashMap(int n){
        list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(null);
        }
    }
    public void put(K key,V value){
        // handle yourself null as key 
        int idx=hashfun(key);
        Node temp=list.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value=value;
                return;
            }
            temp=temp.next;
        }
        temp=list.get(idx);
        Node node=new Node(key, value);
        node.next=temp;
        list.set(idx, node);
        size++;
        double thf=2.0;
        double lf=(1.0*size)/list.size();
        if(lf>thf){
            rehashing();
        }
    }
    public  void rehashing(){
        ArrayList<Node> new_list=new ArrayList<>();
        for (int i = 0; i < 2*list.size(); i++) {
            new_list.add(null);
        }
        ArrayList<Node> old_list=list;
        list=new_list;
        size=0;
        for (Node nn : old_list) {
            while(nn!=null){
                put(nn.key, nn.value);
                nn=nn.next;
            }
            
        }
    }
    @Override
    public  String toString(){
        String s="{";
        for (Node nn : list) {
            while(nn!=null){
              s=s+nn.key+"="+nn.value+",";
                nn=nn.next;
            } 
        }
        return s+"}";
    }
    public V get(K key){
        int idx=hashfun(key);
        Node temp=list.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }
    public V remove(K key){
        int idx=hashfun(key);
        Node curr=list.get(idx);
        Node prev=null;
        while(curr!=null){
            if(curr.key.equals(key)){
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            return null;
        }
        else if(prev==null){
            list.set(idx,curr.next);
        }
        else{
            prev.next=curr.next;
        }
        curr.next=null;
        size++;
        return curr.value;
    }
    public boolean containsKey(K key){
        int idx=hashfun(key);
        Node temp=list.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int hashfun(K key){
        int idx=(key.hashCode())% list.size();
        if(idx<0){
            idx+=list.size();
        }
        return idx;
    }
}
