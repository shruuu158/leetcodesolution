class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                list.add(nums[i]);
            }
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>0){
                if(list.contains(-nums[i])){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}