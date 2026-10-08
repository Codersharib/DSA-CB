import java.util.*;
public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Series(n1,n2);
    }
    public static void Series(int n1,int n2){
        int i=1;
        int count=1;
        while(count<=n1){
            int fn=3*i+2;
            if(fn%n2!=0){
                System.out.println(fn);
                count++;
            }
            i++;
            
        }
    }
}
