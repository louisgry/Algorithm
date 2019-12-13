package algo.cursor;

/**
 * @author Louis
 * @date Create in 2019/12/13 20:32
 */
public class BestTimeToBuyAndSellStockII {
    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     */
    public int maxProfit(int[] prices) {
        int k = 0;
        int res = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]>prices[k]) {
                res += prices[i]-prices[k];
                k = i;
            }
            else {
                k++;
            }
        }
        return res;
    }
}
