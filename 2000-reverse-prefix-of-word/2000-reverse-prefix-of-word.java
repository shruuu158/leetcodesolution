class Solution {
    public String reversePrefix(String word, char ch) {
        String result="";
        for(int i=0;i<word.length();i++){
            
            if(word.charAt(i)==ch){
                result+=reverse(word,i);
                 for(int j=i+1;j<word.length();j++){
                result+=word.charAt(j);
            }
                 return result;
            }
                   

        }
        return word;
    }
    public static String reverse(String word,int i){
        String str="";
        for(int j=i;j>=0;j--){
            str+=word.charAt(j);
        }
        return str;
    }
}