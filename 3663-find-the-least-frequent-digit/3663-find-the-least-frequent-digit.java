class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int rem=n%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            n/=10;
        }
        int num=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int no:map.keySet()){
            if(map.get(no)<min){
                min=map.get(no);
                num=no;
            }else if(map.get(no)==min){
                num=Math.min(num,no);
            }
        }
        return num;
    }
}