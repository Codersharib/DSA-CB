public class strbuildr {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("naam");
        System.out.print(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
