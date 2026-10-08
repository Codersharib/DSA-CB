package OOPs;

public class stack_class implements stack{
    @Override
    public void push(int x){

    }
    @Override
    public int pop(){
        return 0;
    }

    public static void main(String[] args) {
        stack st=new stack_class();
        stack_class st1=new stack_class();
        //annonymous way
        stack st2=new stack(){
            @Override
            public void push(int x){
            }
            @Override
            public int pop(){
                return 0;
            }
        };
    }
}
