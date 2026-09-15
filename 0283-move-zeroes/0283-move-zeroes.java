class Solution {
    public void moveZeroes(int[] nums) {
        //1,3,12,0,0
       //        i 
    //           j
            int i=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
    }
}