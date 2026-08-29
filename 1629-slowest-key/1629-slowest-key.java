class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
    
        int maxInter=releaseTimes[0];
        char ch=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            if((releaseTimes[i]-releaseTimes[i-1])>maxInter){
                maxInter=releaseTimes[i]-releaseTimes[i-1];
                ch=keysPressed.charAt(i);
            }else if((releaseTimes[i]-releaseTimes[i-1])==maxInter){
                if(keysPressed.charAt(i)>ch){
                    ch=keysPressed.charAt(i);
                }
            }
        }
        return ch;
    }
}