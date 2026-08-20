class Solution {
    public String[] findRelativeRanks(int[] score) {
        String result[]=new String[score.length];
        int score2[]=score.clone();
        //10,3,8,9,4
        //i
        Arrays.sort(score2);
        //10 ,9 8 4 3
        //0  1  2 3 4
        //k
        int reverse[]=new int[score2.length];
        int j=0;
        for(int i=score2.length-1;i>=0;i--){
            reverse[j++]=score2[i];
        }
        int l=0;
        for(int i=0;i<score.length;i++){
            for(int k=0;k<reverse.length;k++){
                if(score[i]==reverse[k]){
                    if(k==0){
                        result[l++]="Gold Medal";
                        break;
                    }else if(k==1){
                        result[l++]="Silver Medal";
                        break;
                    }else if(k==2){
                        result[l++]="Bronze Medal";
                        break;
                    }else{
                        result[l++]=k+1+"";
                        break;
                    }
                }
            }
        }
                return result;
    }
}