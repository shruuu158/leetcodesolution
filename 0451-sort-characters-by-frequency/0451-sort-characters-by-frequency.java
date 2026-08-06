class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        StringBuffer sb=new StringBuffer();
        for(char ch: list){
            int count =map.get(ch);
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}