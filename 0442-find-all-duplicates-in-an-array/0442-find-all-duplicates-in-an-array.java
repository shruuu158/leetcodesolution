class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       LinkedHashSet<Integer> uniq = new LinkedHashSet<>();
            List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!uniq.contains(nums[i])){
                uniq.add(nums[i]);
            }else{
                    list.add(nums[i]);
            }
        }
            return list;
    }
}