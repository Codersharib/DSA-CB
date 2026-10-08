package Lec16;

public class dynamicqueue extends Queue{
    @Override
    public void Enqueue(int x) throws Exception{
        if(isFull()){
            int[] new_arr=new int[2*size()];
            for(int i=0;i<size();i++) {
                int idx=(front+i)%size();
                new_arr[i]=arr[idx];
            }
            arr=new_arr;
            front=0;
        }
        super.Enqueue(x);
    }
    public static void main(String[] args) throws Exception{
        dynamicqueue dq=new dynamicqueue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        System.out.println(dq.Dequeue());
        System.out.println(dq.Dequeue());
        dq.Enqueue(50);
        dq.Enqueue(60);
        dq.Enqueue(70);
        dq.Enqueue(80);
        dq.Display();
    }
}
