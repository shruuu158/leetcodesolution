class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        //0 1 2 3 4 5 6 7
        //1 0 0 0 1 0 0 1
        //i
        //        j
        int i=0;
        while(i<nums.length && nums[i]==0){
            i++;
        }
        while(i<nums.length ){
            int j=i+1;//0
            while(j<nums.length && nums[j]==0){
                    j++;
            }
            if(j<nums.length && !(j-i-1>=k)){
                return false;
            }else{
                i=j;
            }
        }
        return true;
    }
}