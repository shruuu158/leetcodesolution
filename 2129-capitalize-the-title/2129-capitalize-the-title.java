class Solution {
    public String capitalizeTitle(String title) {
        String result="";
       title =title.toLowerCase();
        String words[]=title.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=3){
                for(int j=0;j<words[i].length();j++){
                    String s=words[i];
                    if(j==0){
                        char ch=(char)(words[i].charAt(0)-32);
                        result+=ch;
                    }else{
                        result+=words[i].charAt(j);
                    }
                }
                result+=" ";
            }
            else{
                result=result+words[i];
                result+=" ";
            }
           
        }
        return result.trim();
    }
}