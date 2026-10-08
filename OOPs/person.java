package OOPs;

public class person {
    String name ="kaju";
    int age=19;
    public person(String name,int age){
        System.out.println("constructor");
        this.name=name;
        this.age=age;
    }
    static{
        System.out.println("hey");
    }
}
