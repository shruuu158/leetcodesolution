class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            int num=maxword(sentences[i]);
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static int maxword(String set){
        String str[]=set.split(" ");
        return str.length;
    }
}