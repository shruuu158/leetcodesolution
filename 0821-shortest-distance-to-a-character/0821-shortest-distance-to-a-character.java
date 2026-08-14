class Solution {
    public int[] shortestToChar(String s, char c) {
        int result[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    int diff=Math.abs(i-j);
                    min=Math.min(diff,min);
                }
            }
            result[i]=min;
        }
        return result;
    }
}