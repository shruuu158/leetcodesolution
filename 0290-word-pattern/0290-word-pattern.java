class Solution {
    public boolean wordPattern(String pattern, String s) {
        String s2[]=s.split(" ");
        if(pattern.length()!=s2.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String ch2=s2[i];
                if(!check(ch,i,pattern,s2,ch2)){
                    return false;
                }
        }
        return true;
    }
    public static boolean check(char ch,int i,String s1,String s2[],String ch2){
        for(int j=0;j<s1.length();j++){
            if(s1.charAt(j)==ch){
                    if(!(s2[j].equals(ch2))){
                        return false;
                    }
            }
            if(s2[j].equals(ch2)){
                if(!(s1.charAt(j)==ch)){
                    return false;
                }
            }
        }
        return true;
    }
}