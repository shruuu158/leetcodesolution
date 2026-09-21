class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
            String result="";
        for(int i=0;i<words.length;i++){
            result+=reverse(words[i]);
            result+=" ";
        }
        return result.trim();
    }
    public static String reverse(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }
}