package Days45.String;

public class palindromic_Substring {
    public static void main(String[] args) {
        System.out.println(axis_orbit("aaa"));
    }
    public static int axis_orbit(String s){
        int odd=0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis+orbit < s.length() && axis-orbit>=0; orbit++) {
                if(s.charAt(axis-orbit) != s.charAt(axis+orbit)){
                    break;
                }
                odd++;
            }
        }
        int even=0;
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis+orbit < s.length() && axis-orbit>=0; orbit++) {
                if(s.charAt((int)(axis-orbit)) != s.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
        return even+odd;
    }
}
