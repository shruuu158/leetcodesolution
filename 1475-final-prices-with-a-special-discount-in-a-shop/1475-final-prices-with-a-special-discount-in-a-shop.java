class Solution {
    public int[] finalPrices(int[] prices) {
       int result[] = new int[prices.length];
       for(int i=0;i<prices.length;i++){
            int descount=checkdiscount(i,prices);
            result[i]=prices[i]-descount;
       }
       return result;
    }
    public static int checkdiscount(int i,int prices[]){
        if(i<prices.length-1 && prices[i+1]<=prices[i]){
            return prices[i+1];
        }else{
            int k=i+2;
            while(k<prices.length){
                if(prices[k]<=prices[i]){
                    return prices[k];
                }else{
                    k++;
                }
            }
        }
        return 0;
    }
}