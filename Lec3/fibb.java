public class fibb {
    public static void main(String[] args) {
        // index 7th
        int n=7 ; 
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
        if(0%2==0){
            System.out.println("true");
        }


    }
}
