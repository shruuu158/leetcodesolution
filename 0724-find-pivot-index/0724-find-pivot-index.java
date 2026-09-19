class Solution {
    public int pivotIndex(int[] nums) {
       for(int i=0;i<nums.length;i++){
            if(left(nums,i)==right(nums,i)){
                return i;
            }
       } 
       return -1;
    }
    public static int left(int nums[],int k){
            int sum=0;
            for(int i=k-1;i>=0;i--){
                sum+=nums[i];
            }
            return sum;
    }
    public static int right(int nums[],int k){
        int sum=0;
            for(int i=k+1;i<nums.length;i++){
                sum+=nums[i];
            }
            return sum;
    }
}