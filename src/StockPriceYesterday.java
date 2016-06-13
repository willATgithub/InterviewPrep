

public class StockPriceYesterday {
	static int MARKET_OPEN_TIME = 930;

// returns 6 (buying for $5 and selling for $11)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] stockPricesYesterday = {new int[]{16, 15, 13, 10, 6, 1},
				                         new int[]{10, 7, 5, 8, 11, 9},
		                                 new int[]{0,1,5,1,1,1,}};
		for (int [] yesterday : stockPricesYesterday){
			getMaxProfit(yesterday);
		}
	}
	
	static void getMaxProfit(int[] stockPricesYesterday){
		if (stockPricesYesterday.length < 2){
			throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		}
		
		int minPrice = stockPricesYesterday[0];
		int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
		
		
		for(int minute = 1; minute < stockPricesYesterday.length; minute++){
            int currentPrice = stockPricesYesterday[minute];
            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, currentPrice);
		}
		System.out.println(maxProfit);
		//return maxprofit;
	}

}
