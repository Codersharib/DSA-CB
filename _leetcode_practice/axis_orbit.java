package _leetcode_practice;

public class axis_orbit {

    public static void main(String[] args) {
        System.out.println(axis_orbit("sharib"));
    }

    public static int axis_orbit(String ques) {
        int odd = 0;
        for (int axis = 0; axis < ques.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < ques.length(); orbit++) {
                if (ques.charAt(axis - orbit) != ques.charAt(axis + orbit)) {
                    break;
                }
                odd++;
            }
        }

        int even = 0;
        for (float axis = 0.5f; axis < ques.length(); axis++) {
            for (float orbit = 0.5f; (axis - orbit) >= 0 && (axis + orbit) < ques.length(); orbit++) {
                if (ques.charAt((int)(axis - orbit)) != ques.charAt((int)(axis + orbit))) {
                    break;
                }
                even++;
            }
        }
        return odd+even;
    }
}
