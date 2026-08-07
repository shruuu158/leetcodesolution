class Solution {
    public int maxProfit(int[] prices) {
        int maxprice=0;
        int buyprice=prices[0];//7
        for(int i=1;i<prices.length;i++){
            int current=prices[i]-buyprice;//1-7=-6;
            if(maxprice<current){
                maxprice=current;
            }
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
        }
        return maxprice;
    }
}