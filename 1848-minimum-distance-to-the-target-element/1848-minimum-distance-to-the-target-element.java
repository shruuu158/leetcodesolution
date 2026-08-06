class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
            int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
               int result =Math.abs(i-start);
               min=Math.min(min,result);
            }
        }
            return min;
    }
}