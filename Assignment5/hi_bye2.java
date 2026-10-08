package Assignment6;
import java.util.*;
public class hi_bye2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(c_hi_bye(s));
        System.out.println(r_hi_bye(s));
        System.out.println(re_hi_bye(s));
    }
    public static int c_hi_bye(String s){
        if(s.length()<2) return 0;
        if(s.charAt(0)=='h' && s.charAt(1)=='i'){
            if(s.length()==2 || s.charAt(2)!='t'){
                return 1+c_hi_bye(s.substring(2));
            }
        }
        return c_hi_bye(s.substring(1));
    }
    public static String r_hi_bye(String s){
        if(s.length()<2) return  s;
        if(s.charAt(0)=='h' && s.charAt(1)=='i'){
            if(s.length()==2 || s.charAt(2)!='t'){
                return r_hi_bye(s.substring(2));
            }
        }
        return s.charAt(0)+r_hi_bye(s.substring(1));
    }
    public static String re_hi_bye(String s){
        if(s.length()<2) return  s;
        if(s.charAt(0)=='h' && s.charAt(1)=='i'){
            if(s.length()==2 || s.charAt(2)!='t'){
                return "bye"+re_hi_bye(s.substring(2));
            }
        }
        return s.charAt(0)+re_hi_bye(s.substring(1));
    }
}
