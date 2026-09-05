class Solution {
    public String replaceDigits(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                result+=s.charAt(i);
            }else{
                result+=shift(result.charAt(result.length()-1),s.charAt(i));
            }
        }
        return result;
    }
    public static char shift(char ch,char digit){
            int x=ch-'0';
            char str=(char)(x+digit);
            return str;
    }
}