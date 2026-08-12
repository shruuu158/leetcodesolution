class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer,Integer> map1=new HashMap<>();
       for(int num:arr){
        map1.put(num,map1.getOrDefault(num,0)+1);
       } 
       Map<Integer,Integer> map2=new HashMap<>();
       for(int num:map1.keySet()){
            map2.put(map1.get(num),map2.getOrDefault(map1.get(num),0)+1);
       }
       for(int num:map2.keySet()){
        if(map2.get(num)>1){
            return false;
        }
       }
       return true;
    }
}