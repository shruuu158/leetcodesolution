class Solution {
    public int findLucky(int[] arr) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            
            for(int n:map.keySet()){
                if(map.get(n)==n){
                    max=Math.max(max,n);
                }
            }
            if(max==0){
                return -1;
            }
                       return max;
    }
}               