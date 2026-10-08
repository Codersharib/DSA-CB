public class str_demo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        string_demo2();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        long start1=System.currentTimeMillis();
        string_demo();
        long end1=System.currentTimeMillis();
        System.out.print(end1-start1);

    }
    public static void string_demo(){
        String s="";
        for(int i=0;i<1000_000;i++){
            s+=i;
        }
    }
    public static void string_demo2(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<1000_000;i++){
            sb.append(i);
        }
    }
    
}
