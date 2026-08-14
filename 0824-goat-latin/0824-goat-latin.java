class Solution {
    public String toGoatLatin(String sentence) {
        String words[]=sentence.split(" ");
        String result="";
        String fina="";
        for(int i=0;i<words.length;i++){
               String str=words[i];
               char ch[]=str.toCharArray();
               if(ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o'|| ch[0]=='u' || ch[0]=='A' || ch[0]=='E' || ch[0]=='I' || ch[0]=='O'|| ch[0]=='U'){
                    result+=apendLast(words[i]);
                    result+=" ";
               }else{
                    result+=removefirst(words[i]);
                    result+=" ";
               }
        }
        String w[]=result.split(" ");
        for(int i=0;i<w.length;i++){
            String ne=w[i];
            for(int j=0;j<=i;j++){
                
                ne+="a";
                
            }
            fina+=ne+" ";
                
        }
        return fina.trim();
    }
    public static String apendLast(String words){
        return words+"ma";
    }
    public static String removefirst(String words){
        String str="";
        char ch[]=words.toCharArray();
        for(int i=1;i<ch.length;i++){
                str+=ch[i];
        }
        str+=ch[0];
        return str+"ma";
    }
}