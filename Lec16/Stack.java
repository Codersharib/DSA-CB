package Lec16;

public class Stack {
    protected int[] arr;
    private int idx;
    public Stack(){
        this(5);
    }
    public Stack(int n){
        arr=new int[n];
    }
    public boolean isEmpty(){
        return idx==-1;
    }
    public boolean isFull(){
        return size()==arr.length;
    }
    public void push(int x) throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full.");
        }
        this.arr[++this.idx]=x; //arr[++idx]=x;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty.");
        }
        int x=arr[idx--];
        return x;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty.");
        }
        int x=arr[idx];
        return x;
    }
    public int size(){
        return idx+1;
    }
    public  void Display(){
        for(int i=0;i<=idx;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
