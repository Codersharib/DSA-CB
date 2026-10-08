import java.util.*;
public class arr_demo {
    public static void main(String[] args) {
        // hard coded array
        int[] arr={5,7,2,6,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        // print
        display(array);
    }
    public static void display(int[] array){
        for(int num : array){
            System.out.print(num+" ");
        }
    }

}
