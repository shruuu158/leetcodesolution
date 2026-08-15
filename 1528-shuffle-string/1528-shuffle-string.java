class Solution {
    public String restoreString(String s, int[] indices) {
        //c o d e l e e t
        //0 1 2 3 4 5 6  7        //  0 1 2 3 4 5 6 7
        //i                       //  4 5 6 7 0 2 1 3 
                                 //           j
               String str="";                               
        for(int i=0;i<s.length();i++){
                for(int j=0;j<indices.length;j++){
                        if(i==indices[j]){
                            str+=s.charAt(j);
                        }
                }
        }
        return str;
    }
}