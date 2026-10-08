    package Assignment6;
    import java.util.*;
    public class dictionary_larger {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String st=sc.next();
            List<String> ll=new ArrayList<>();
            print_dic(st, "",st,ll);
            Collections.sort(ll);
            for(String s:ll){
                System.out.println(s);
            }
        }
        public static void print_dic(String ques,String ans,String ques_teemp,List<String> ll){
            if(ques.length()==0){
                if(ans.compareTo(ques_teemp)<0){
                    ll.add(ans);
                    // System.out.println(ans);
                }
                return;
            }
            for(int i=0;i<ques.length();i++){
                char ch=ques.charAt(i);
                String s1=ques.substring(0,i);
                String s2=ques.substring(i+1);
                print_dic(s1+s2,ans+ch,ques_teemp,ll);
            }
        }
    }
