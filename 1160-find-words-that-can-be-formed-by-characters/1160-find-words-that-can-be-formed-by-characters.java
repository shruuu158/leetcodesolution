class Solution {
    public int countCharacters(String[] words, String chars) {
       
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(iscontain(words[i],chars)){
                cnt+=words[i].length();
            }
        }
            return cnt;
    }
    public static boolean iscontain(String words,String chars){
        
          int freq[]=new int[26];
          for(char ch: chars.toCharArray()){
                freq[ch-'a']++;
          }
          for(char ch: words.toCharArray()){
                if(freq[ch-'a']<=0){
                    return false;
                }else{
                    freq[ch-'a']--;
                }

          }
               return true;
        }
}
        