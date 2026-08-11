class Solution {
    public boolean validPalindrome(String s) {
         int i=0;
         int j=s.length()-1;
         while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isPalindrom(s,i+1,j)|| isPalindrom(s,i,j-1);
            }
          
         }
           return true;
    }
    public static boolean isPalindrom(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}