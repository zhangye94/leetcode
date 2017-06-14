package Medium;

public class P309BestTimeToBuyAndSellStockWithCooldown {
	public static int maxProfit(int[] prices) {
        int sell = 0, prevSell = 0, buy = Integer.MIN_VALUE, prevBuy;
        for (int i=0;i<prices.length;i++){
        	prevBuy = buy;
        	buy = Math.max(prevSell - prices[i], prevBuy);
        	prevSell = sell;
        	sell = Math.max(prevBuy + prices[i], prevSell);
        }
        return sell;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,0,2};
		System.out.println(maxProfit(arr));
	}

}
