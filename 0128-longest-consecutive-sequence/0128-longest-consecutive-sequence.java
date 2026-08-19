class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        //1 2 3 4 100 200
        int max=0;
        int cnt=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                    continue;
            }
            else if(nums[i]-nums[i-1]==1){
                cnt++;//4
            }else{
                max=Math.max(cnt,max);
                cnt=1;
            }
        }
        max=Math.max(cnt,max);
        return max;
    }
}