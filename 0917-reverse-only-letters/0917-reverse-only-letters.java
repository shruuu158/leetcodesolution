class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        //a-bc-def-ghij
        //i           j
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(!( ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')){
                i++;
            }else if(!( ch[j]>='a' && ch[j]<='z' || ch[j]>='A' && ch[j]<='Z')){
                j--;
            }else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        String result="";
            for(char ch2:ch){
                result+=ch2;
            }
            return result;
    }
}