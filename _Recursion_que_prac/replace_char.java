package _Recursion_que_prac;

public class replace_char {
    public static void main(String[] args) {
        System.out.println(CC("cat"));
    }
    public static String CC(String s){
        if(s.length()==0) return "";
        char ch=s.charAt(0);
        String str="";
        if((ch=='a')){
            str=str + 'o';
        }
        else{
            str=str + ch;
        }
        return str+CC(s.substring(1));
    }
}
