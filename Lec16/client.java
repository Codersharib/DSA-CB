package Lec16;

public class client {
    public static void main(String[] args) {
        // case1
        P obj=new P();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        obj.fun();
        obj.fun1();
        //  case2
        P obj2=new C();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        System.out.println(((C)obj2).d2);
        System.out.println(((C)obj2).d);
        obj2.fun(); // chah krke bhi p ka fun access nhi kr skte only c's fun.
        obj2.fun1();
        ((C)obj2).fun2();
        //case3 
        // C obj3=new P();
        // System.out.println(obj3.d);
        // System.out.println(obj3.d1);
        // System.out.println(((C)obj3).d2);
        C obj3=new C();
        System.out.println(obj3.d);
        System.out.println(((P)obj3).d);
        System.out.println(((C)obj3).d1);
        System.out.println(((C)obj3).d2);
        obj3.fun();
        obj3.fun1();
        // obj.fun2();
    }
}
