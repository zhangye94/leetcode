package Hard;

public class P123BestTimeToBuyAndSellStockIII {
	public static int maxProfit(int[] prices) {
		if(prices.length == 0) return 0;
		int firstBuy = Integer.MIN_VALUE, firstSell = 0;
	    int secondBuy = Integer.MIN_VALUE, secondSell = 0;
	    for(int i=0;i<prices.length;i++){
	    	firstBuy = Math.max(firstBuy, -prices[i]);
	    	firstSell = Math.max(firstSell, prices[i] + firstBuy);
	    	secondBuy = Math.max(secondBuy, firstSell - prices[i]);
	    	secondSell = Math.max(secondSell, prices[i] + secondBuy);
	    }
		return secondSell;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4};
		System.out.println(maxProfit(arr));
	}

}
