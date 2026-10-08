package Lec23;
import java.util.*;
public class cars_client {
    public static void main(String[] args) {
        cars[] arr=new cars[5];
        arr[0] = new cars(200, 10, "White");// P S C
		arr[1] = new cars(1000, 20, "Black");
		arr[2] = new cars(345, 3, "Yellow");
		arr[3] = new cars(34, 89, "Grey");
		arr[4] = new cars(8907, 6, "Red");
        Arrays.sort(arr,(a,b)->a.price-b.price);
        // Arrays.sort(arr , new Comparator<cars>() {
        //     @Override
        //     public int compare(cars o1,cars o2){
        //         return o1.price-o2.price;
        //     }
        // });
        // Arrays.sort(arr , new Comparator<cars>() {
        //     @Override
        //     public int compare(cars o1,cars o2){
        //         return o1.speed-o2.speed;
        //     }
        // });
        // sort(arr);
        display(arr);
    }
    public static <T extends Comparable<T>> void sort(T [] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++) {
                if(arr[i].compareTo(arr[i+1])>0){    // here both side would be address and address is not compared its equal or not just.
                    // so use compareto which is written in comparable interface;
                    T temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    // it prints address as refrence variavle calls toString internally
    public static  <T>void display(T[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
