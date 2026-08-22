class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(contains(words[i],allowed)){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean contains(String word,String allowed){
        List<Character> list=new ArrayList<>();
        for(int i=0;i<allowed.length();i++){
            list.add(allowed.charAt(i));
        }
        for(int i=0;i<word.length();i++){
            if(!(list.contains(word.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}