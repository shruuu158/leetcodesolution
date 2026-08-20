class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];//5
        int index=0;
        for(int i=1;i<=n/2;i++){//2
            ans[index++]=i;
            ans[index++]=-i;
        }
        if(n%2!=0){
            ans[ans.length-1]=0;
        }
            return ans;
    }
}