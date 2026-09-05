class Solution {
    public int[] countOppositeParity(int[] nums) {
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                int cnt=0;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2==0){
                        cnt++;
                    }
                }
                result[i]=cnt;
            }else {
                int cnt=0;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2!=0){
                        cnt++;
                    }
                }
                 result[i]=cnt;   
            }
        }
        return result;
    }
}