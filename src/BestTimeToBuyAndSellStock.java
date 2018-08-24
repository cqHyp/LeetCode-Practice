/**
 * #121 Best Time to Buy and Sell Stock
 *
 * @Author: Poldi
 * @Date: 2018/7/19 下午2:40
 * @Description:
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int temp = prices[0];
        int dis = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > temp) {
                dis = Math.max(dis, prices[i] - temp) ;
            } else{
                temp = prices[i];
            }
        }
        return dis;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] a = {2,4,15,1,11};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(a));
    }
}
