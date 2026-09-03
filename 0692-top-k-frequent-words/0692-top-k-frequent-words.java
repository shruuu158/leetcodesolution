class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->{
            if(map.get(b)!=map.get(a)){
                return map.get(b)-map.get(a);

            }else{
                return a.compareTo(b);
            }
        });
        for(int i=0;i<k;i++){
            result.add(list.get(i));
        }
                return result;
    }

}