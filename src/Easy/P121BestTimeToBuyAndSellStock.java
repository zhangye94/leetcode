package Easy;

public class P121BestTimeToBuyAndSellStock {
	public static int maxProfit(int[] prices) {
		if(prices.length == 0) return 0;
		int low = prices[0];
		int res = 0;
		for(int i=0;i<prices.length;i++){
			if(prices[i]<low){
				low = prices[i];
			}
			if(res < prices[i] - low){
				res = prices[i] - low;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 6, 4, 3, 1};
		System.out.println(maxProfit(arr));
	}

}
