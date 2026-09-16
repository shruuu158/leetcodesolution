class Solution {
    public int strStr(String haystack, String needle) {
       for(int i=0;i<haystack.length();i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    if(compare(i,haystack,needle)){
                        return i;
                    }
                }
       } 
       return -1;
    }
    public static boolean compare(int i,String s1,String s2){
        int j=i;
        int k=0;
        while(j< s1.length() && k<s2.length() ){
            if(s1.charAt(j)!=s2.charAt(k)){
                return false;
            }else{
                j++;
                k++;
            }
        }
        return k==s2.length();
    }
}