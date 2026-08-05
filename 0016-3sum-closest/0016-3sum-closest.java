class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //-1,2,1,-4
        //k  i    j
        Arrays.sort(nums);
        int closetsum=0;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<nums.length-2;k++){
            int i=k+1;
            int  j=nums.length-1;

            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                int diff=Math.abs(sum-target);
                    if(diff<min){
                        min=diff;
                        closetsum=sum;
                    }
                    if(sum<target){
                        i++;
                    }else{
                        j--;
                    }
            }

        }
        return closetsum;
    }
}