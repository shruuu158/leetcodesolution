class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        for(int i=0;i<words.length;i++){
            boolean b[]=new boolean[26];
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                b[ch-'a']=true;
            }
              
            for(int j=i+1;j<words.length;j++){
                          boolean com=false;
                    for(int k=0;k<words[j].length();k++){
                        char ch=words[j].charAt(k);
                        if(b[ch-'a']){
                            com=true;
                            break;
                        }
                    }
                    if(!com){
                        int prodcut=words[i].length()*words[j].length();
                        max=Math.max(max,prodcut);
                    }
            }
            
        }
           
            return max;
    
    }
}