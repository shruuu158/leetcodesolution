class Solution {
    public int removeDuplicates(int[] nums) {
        //0 1 2 3 4
        //      i j
        int k=nums.length;
        int i=0;
        while(i<k-1){
            int j=i+1;
            if(nums[i]==nums[j]){
                for(int x=j;x<k-1;x++){
                    nums[x]=nums[x+1];
                
                }
                k--;
            }else{
                i++;
            }
        }
        return k;
    }
}