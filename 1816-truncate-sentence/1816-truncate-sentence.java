class Solution {
    public String truncateSentence(String s, int k) {
        String result="";
        String words[]=s.split(" ");
        for(int i=0;i<k;i++){
            result=result+words[i];
            result+=" ";

        }
        return result.trim();
    }
}