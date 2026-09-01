class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int n:map.keySet()){
            
                int count=Math.min(map.get(n),k);
                for(int i=0;i<count;i++){
                    list.add(n);
                }
            
        }
        int l=0;
        int arr[]=new int[list.size()];
            for(int n:list){
                arr[l++]=n;
            }
            return arr;
    }
}