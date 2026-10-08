package Lec12;

public class count_palindrome_substirng_odd {
    public static void main(String[] args) {
        String str="naian";
        System.out.println(axis_orbit(str));
    }
    public static int axis_orbit(String s){
        int odd=0;
        for(int axis=0;axis<s.length();axis++){
            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                odd++;
            }
        }
        return odd;
    }
}
