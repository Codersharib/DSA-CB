package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class evanescent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(minStr(s, n));
        }
    }
    public static int minStr(String s,int n){
        if(s.length()!=n) return 0;
        // handle 2 length str seperately
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        if(s.length()==2) {
            if(s.charAt(0)!=s.charAt(1)) return 2;
            else return 1;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=1;i<s.length()-1;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        char temp='0';
        for(char key:map.keySet()){
            if(map.get(key)==1 && (key!=s.charAt(0) || key!=s.charAt(s.length()-1))){
                temp=key;
                map.remove(key);
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        if(temp=='0'){
            for(int i=1;i<s.length()-1;i++){
                sb.append(s.charAt(i));
            }
        }
        else{
            for(int i=1;i<s.length()-1;i++){
                if(s.charAt(i)==temp){
                    continue;
                }
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(s.length()-1));
        // final
        StringBuilder sf=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sf.length()==0 || sf.charAt(sf.length()-1) !=sb.charAt(i)){
                sf.append(sb.charAt(i));
            }
        }
        return sf.length();
    }
}
