class Solution {
    public boolean isAnagram(String s, String t) {
        int fre[]=new int[26];
       if(s.length()!=t.length()){
        return false;
       }
       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
            char ch2=t.charAt(i);
            fre[ch2-'a']--;
       }
       for(int i=0;i<26;i++){
        if(fre[i]!=0){
            return false;
        }
       }
        return true;
    }
}