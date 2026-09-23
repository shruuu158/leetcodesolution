class Solution {
    public String toLowerCase(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            char ch=(char)(s.charAt(i)+32);
            result+=ch;
            }else{
                result+=s.charAt(i);
            }
        }
        return result;
    }
    
}