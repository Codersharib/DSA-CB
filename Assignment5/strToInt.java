package Assignment6;

import java.util.Scanner;

public class strToInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(str_to_int(s));
    }
    public static int str_to_int(String s){
        if(s.length()==0) {
            return 0;
        }
        int dig=s.charAt(s.length()-1)-'0';
        return str_to_int(s.substring(0,s.length()-1))*10+dig;
    }
}
