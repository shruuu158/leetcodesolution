class Solution {
    public int dominantIndex(int[] nums) {
        int maxNumber=Integer.MIN_VALUE,maxindex=0;//3,6,1,0
                                                //   0 1 2 3
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxNumber){
                maxNumber=nums[i];
                maxindex=i;//1
            }
        }
            for(int i=0;i<nums.length;i++){
                if(maxNumber!=nums[i] && maxNumber<2*nums[i]){
                    return -1;
                }
            }
        
        return maxindex;
    }
}