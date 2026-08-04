class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
            Arrays.sort(nums);
            //1,2,3,4,5
            for(int i=nums[0];i<=nums[nums.length-1];i++){
                //1 4 2 5
                boolean found=false;
                for(int j=0;j<nums.length;j++){
                    if(i==nums[j]){
                        found=true;
                    }
                }
                if(!found){
                    list.add(i);
                }
            }
             Collections.sort(list);
             return list;
    }
}