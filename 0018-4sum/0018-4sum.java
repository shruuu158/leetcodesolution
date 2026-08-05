class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //1,0,-1,0,-2,2
        //-2,-2,0,0,1,2
        // k
        //    l
        //             i  
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-3;k++){
                if(k>0 && nums[k]==nums[k-1]) continue;
            for(int l=k+1;l<nums.length-2;l++ ){
                if(l>k+1 && nums[l]==nums[l-1]) continue;
                int i=l+1;
                int j=nums.length-1;
                while(i<j){
                    long sum=(long)nums[k]+nums[l]+nums[i]+nums[j];
                    if(sum==target){
                        ArrayList<Integer> in=new ArrayList<>();
                        
                        in.add(nums[k]);
                        in.add(nums[l]);
                        in.add(nums[i]);
                        in.add(nums[j]);
                        
                        list.add(in);
                        i++;
                        j--;
                        while(i<j && nums[i]==nums[i-1]) {
                            i++;
                        }
                        while(i<j && nums[j]==nums[j+1]){
                            j--;
                        }
                    }else if(sum<target){
                        i++;
                    }else if(sum>target){
                        j--;
                    }
                }
            }
        }
        return list;
    }
}