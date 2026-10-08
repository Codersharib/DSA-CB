package Lec23;

public class generic_Demo {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50};
        display(arr);
        String s1[]={"raj","bholu","ankit","anku"};
        display(s1);
        System.out.println(arr);
    }
    public static <T>void display(T[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static <T>T get(T[] arr){
        return arr[0];
    }
}
