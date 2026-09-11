class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;//3;
    int totalsum=0;
    int ArraySum=0;
    for(int i=1;i<=n;i++){
        totalsum+=i;//1+2+3=6;
    }
    for(int j=0;j<nums.length;j++){
        ArraySum+=nums[j];//0+3+1;
    }
        return totalsum-ArraySum;
    }
}