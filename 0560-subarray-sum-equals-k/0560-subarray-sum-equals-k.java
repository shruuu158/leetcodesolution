class Solution {
    public int subarraySum(int[] nums, int k) {
        //1 1 1
        //  i
        //  j
        int i=0;
        int cnt=0;
        while(i<nums.length){
            int j=i;
            int sum=0;
            while(j<nums.length){
                
                   sum+=nums[j];
                   if(sum==k){
                    cnt++;
                   }
                   j++;
                }
            
            i++;
        }
        return cnt;
    }
}