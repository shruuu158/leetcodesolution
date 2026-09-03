class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String result="";
        for(String k:words){
            result+=k.charAt(0);
        }
        if(s.equals(result)){
            return true;
        }
        return false;
    }
}