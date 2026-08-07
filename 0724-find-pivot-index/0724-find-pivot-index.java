class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
                if(leftsum(nums,0,i-1)==rightsum(nums,i+1,nums.length-1)){
                    return i;
                }
        }
        return -1;
    }
    public static int leftsum(int nums[],int left,int right){
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=nums[i];
        }
        return sum;
    }
     public static int rightsum(int nums[],int left,int right){
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=nums[i];
        }
        return sum;
    }
}