class Solution {

    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
       while(i<s.length()){
        if(s.charAt(i)=='*'){
            sb.deleteCharAt(sb.length()-1);
            i++;
        }else{
            sb.append(s.charAt(i));
            i++;
        }
       }
       return sb.toString();
    }
}