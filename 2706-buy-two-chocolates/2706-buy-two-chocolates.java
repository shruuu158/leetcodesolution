import java.util.*;
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int num=prices[0]+prices[1];
        if(num>money){
            return money;
        }
        return money-num;
    }
}