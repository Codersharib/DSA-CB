package Days45.String;

import java.util.Scanner;

public class pasha_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int[] m=new int[n];
        for (int i = 0; i < m.length; i++) {
            m[i]=sc.nextInt();
        }
        System.out.println(pashaString(s, m));
    }
    public static String pashaString(String s,int[] m){
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        for (int i = 0; i < m.length; i++) {
            int si=m[i];
            int ei=n-si+1;
            reverse(sb, si-1, ei-1);
        }
        return sb.toString();
    }
    public static void reverse(StringBuilder s,int si,int ei){
        while(si<=ei){
            char temp=s.charAt(si);
            s.setCharAt(si, s.charAt(ei));
            s.setCharAt(ei, temp);
            si++;
            ei--;
        }
    }
}
