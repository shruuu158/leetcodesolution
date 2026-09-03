class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            int num=strOrNum(strs[i]);
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static int strOrNum(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){

                return str.length();
            }
        }
              int num=Integer.parseInt(str);
                return num;
    }
}