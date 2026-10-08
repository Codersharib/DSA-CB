package Lec12;

public class ount_palindrome_substirng_even {
    public static void main(String[] args) {
        String str="naan";
        System.out.println(axis_orbit(str));
    }
    public static int axis_orbit(String s){
        int even=0;
        for(double axis=0.5;axis<s.length();axis++){
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
        return even;
    }
}
