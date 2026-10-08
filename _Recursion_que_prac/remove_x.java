package _Recursion_que_prac;

public class remove_x {
    public static void main(String[] args) {
        System.out.println(CC("xoxoxo"));
    }
    public static String CC(String s){
        if(s.length()==0) return "";
        char ch=s.charAt(0);
        String str="";
        if(!(ch=='x')){
            str=str + ch;
        }
        return str+CC(s.substring(1));
    }
}
