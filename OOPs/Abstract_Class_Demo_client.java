package OOPs;

public class Abstract_Class_Demo_client {
    public static void main(String[] args) {
        Abstract_Class_Demo2 ab=new Abstract_Class_Demo2();
        ab.pay_bal(8);
        Abstract_Class_Demo ab2=new Abstract_Class_Demo(){
            @Override
            public boolean pay_bal(int x) {
                return false;
            }
        };
    }
}
