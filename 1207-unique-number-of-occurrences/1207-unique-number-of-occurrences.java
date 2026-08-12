class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer,Integer> map1=new HashMap<>();
       for(int num:arr){
        map1.put(num,map1.getOrDefault(num,0)+1);
       } 
       HashSet<Integer> set=new HashSet<>();
       for(int num:map1.keySet()){
            int val=map1.get(num);
            if(!set.contains(val)){
                set.add(val);
            }else{
                return false;
            }
       }
       return true;
    }
}