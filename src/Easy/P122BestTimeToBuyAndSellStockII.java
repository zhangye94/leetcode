package Easy;

public class P122BestTimeToBuyAndSellStockII {
	public static int maxProfit(int[] prices) {
		int res = 0;
        for(int i=0;i<prices.length-1;i++){
        	if(prices[i+1]>prices[i]){
        		res = res + prices[i+1] - prices[i];
        	}
        	
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}

}
