class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int target=nums[i+1];
                map.put(target,map.getOrDefault(target,0)+1);
            }
        }
        int max=0;
        int num=0;
        for(int n:map.keySet()){
            if(map.get(n)>max){
                max=map.get(n);
                num=n;
            }
        }
        return num;
    }
}