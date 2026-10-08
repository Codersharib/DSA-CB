package OOPs;

public class student {
    String name;
    int age;
    public void intro_yourself(){
        System.out.println("my name is "+name+" and age is "+age);
    }
    public  void Sayhey(String name){
        System.out.println(this.name+" say hey "+name);
    }
    public static void mentor_name(student s){
        System.out.println("monu bhaiya "+s.name);
    }
    static{
        System.out.println("hey i am static blcok of studnet ");
    }
}
