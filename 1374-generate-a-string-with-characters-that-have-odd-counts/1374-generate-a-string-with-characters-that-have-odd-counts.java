class Solution {
    public String generateTheString(int n) {
        String result="";
        if(n%2!=0){
            for(int i=0;i<n;i++){
                result+='a';
            }
        }else if(n%2==0){
            for(int i=0;i<n-1;i++){
                result+='a';
            }
            result+='b';
        }
        return result;
    }
}