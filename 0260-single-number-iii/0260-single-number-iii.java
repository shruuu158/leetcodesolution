class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int i=0;
        for(int n:map.keySet()){
            if(map.get(n)==1){
                ans[i++]=n;
            }
        }
        return ans;
    }
}