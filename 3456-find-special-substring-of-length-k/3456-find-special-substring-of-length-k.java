class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        //a a  b a a 
        //            i

        int cnt=1;
        for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    cnt++;
                }else{
                    if(cnt==k){
                        return true;
                    }else{
                        cnt=1;
                    }
                }
               
        }
         return cnt==k;
    }
    
}