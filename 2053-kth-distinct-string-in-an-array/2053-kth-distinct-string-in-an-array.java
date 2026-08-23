class Solution {
    public String kthDistinct(String[] arr, int k) {
        int cnt=0;
      Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for( String n:map.keySet()){
            if(map.get(n)==1){
                cnt++;
                if(cnt==k){
                    return n;
                }
            }
        }
        return "";
    }
}