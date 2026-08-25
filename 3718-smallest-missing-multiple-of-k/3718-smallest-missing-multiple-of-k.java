class Solution {
    public int missingMultiple(int[] nums, int k) {  
        List<Integer> list=new ArrayList<>();
        for(int c:nums){
            list.add(c);
        }  
        for(int i=1;;i++){
            if(!list.contains(k*i)){
                return k*i;
            }
        }
        
    }
}