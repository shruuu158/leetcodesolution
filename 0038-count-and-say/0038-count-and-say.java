class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            s=mach(s);//11
            
        }
        return s;
    }
    public static String mach(String str){
        
       String  result="";
        //1211  
        //   i       2
        int cnt=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }else{
                result=result+cnt+str.charAt(i-1);//11211
                cnt=1;
            }
                
        }
        result=result+cnt+str.charAt(str.length()-1);
                return result;
        
    }
}