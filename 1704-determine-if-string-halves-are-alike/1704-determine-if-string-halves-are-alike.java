class Solution {
    public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()/2-1;//1
        int k=s.length()/2;//2
        int l=s.length()-1;
        int first=firstHalf(s,i,j);
        int secound=secoundhalf(s,k,l);
        if(first==secound){
            return true;
        }
        return false;
    }
    public static int firstHalf(String s, int i,int j){
        int cnt=0;
        for(int k=i;k<=j;k++){
            char ch=s.charAt(k);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                cnt++;
            }
        }
        return cnt;
    }
     public static int secoundhalf(String s, int k,int l){
        int cnt=0;
        for(int i=k;i<=l;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                cnt++;
            }
        }
        return cnt;
    }

}