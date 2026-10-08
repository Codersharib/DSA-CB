public class kth_character_Game {
    public static void main(String[] args) {
        System.out.println(kthchar(10));
    }
    // public static void kthchar(int k,String ans,String str){
    //     if(str.length()>=k){
    //         System.out.println(str.charAt(k-1));
    //         return;
    //     }
    //     if(ans.length()>=0){
    //         char ch=ans.charAt(0);
    //         if(ch=='z') ch='a';
    //         else ch++;
    //         str=str+ch;
    //         kthchar(k, ans.substring(1),str);
    //         ans=str;
    //     }
    // }
    public static char kthchar(int k){
        String str="a";
        while(str.length()<k){
            String str2="";
            for(int i=0;i<str.length();i++) {
                char ch=str.charAt(i);
                if(ch=='z') ch='a';
                else ch++;
                str2=str2+ch;
            }
            str=str+str2;
        }
        return str.charAt(k-1);
    }
}
