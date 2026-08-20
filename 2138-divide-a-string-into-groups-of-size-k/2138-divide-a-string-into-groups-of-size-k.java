class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            String str="";
            for(int j=i;j<i+k && j<s.length();j++){
          str+=s.charAt(j);//abc
           
        }
         if(str.length()!=k){
                int cnt=k-str.length();
                for(int l=0;l<cnt;l++){
                    str+=fill;
                }
                    list.add(str);
            }else{
                list.add(str);
            }
        }
        int j=0;
        String ans[]=new String[list.size()];
        for(String n:list){
            ans[j++]=n;
        }
         return ans;
        }
   
}