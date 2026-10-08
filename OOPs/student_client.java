package OOPs;

public class student_client {
    public static void main(String[] args) {
        student s=new student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name="kaju";
        s.age=19;
        s.intro_yourself();
        student s1=new student();
        s1.name="katli";
        s1.age=21;
        System.out.println(s.name);
        System.out.println(s.age);
        s1.intro_yourself();
        s.Sayhey("gautum");
        student.mentor_name(s);
    }
    static{
        System.out.println("hey i am static blcok of studnet client");
    }
}
