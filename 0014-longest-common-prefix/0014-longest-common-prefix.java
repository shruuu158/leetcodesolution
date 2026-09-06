class Solution {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       String result="";
       String words1=strs[0];
       String words2=strs[strs.length-1];
        for(int i=0;i<words1.length() && i< words2.length();i++){
            if(words1.charAt(i)==words2.charAt(i)){
                result+=words1.charAt(i);
            
            }else{
                break;
            }
        }
        return result;
    }
}
