package Lec9;

public class reverse_words {
    public static void main(String[] args) {
        String s=" hey buddy whats up  ";
        System.out.print(reverse_words_(s));
    }
    public static String reverse_words_(String s){
        StringBuilder sb=new StringBuilder("");
        s=s.trim();
        String[] words = s.split(" +");
        for(int i=words.length-1;i>=0;i--){
            if(i!=0){
                sb.append(words[i]);
                sb.append(" ");
            }
            else{
                sb.append(words[i]);
            }
            // System.out.print(words[i]+" ");
        }
        return sb.toString();
    }
}
