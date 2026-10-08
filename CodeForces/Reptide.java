package CodeForces;

import java.util.Scanner;

public class Reptide {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(reptide(arr));
        }
    }

    public static int reptide(int[] arr) {
        int count = 0;
        while (arr[0] != arr[1] && arr[0] != arr[2] && arr[1]!=arr[2]) {
            int max = arr[0];
            int idx1 = 0;
            int min = arr[0];
            int idx2 = 0;
            for (int i = 0; i < 3; i++) {
                if (max < arr[i]) {
                    idx1=i;
                    max=arr[i];
                }
                if (min > arr[i]) {
                    idx2=i;
                    min=arr[i];
                }
            }
            arr[idx1]--;
            arr[idx2]++;
            count++;
        }
        return count;
    }
}
