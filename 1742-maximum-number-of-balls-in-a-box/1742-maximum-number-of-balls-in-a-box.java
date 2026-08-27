class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            if(i<9){
                map.put(i,map.getOrDefault(i,0)+1);
            }else{
                int sum=0;
                int temp=i;
                while(temp!=0){
                    int rem=temp%10;
                    sum+=rem;
                    temp/=10;
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int max=0;
        for(int n:map.keySet()){
            int num=map.get(n);
            max=Math.max(num,max);
        }
        return max;
    }
}