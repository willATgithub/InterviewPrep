
def get_max_profit(stock_prices_yesterday):
    if len(stock_prices_yesterday) < 2:
        raise Exception("Getting a profit requires at least 2 prices")
    min_price = stock_prices_yesterday[0]
    max_profit = stock_prices_yesterday[1] - stock_prices_yesterday[0]
    
    for index,price in  enumerate(stock_prices_yesterday):
        #print price
        if index == 0:
            continue
        current_price = price
        potential_profit = current_price - min_price
        min_price = min(current_price, min_price)
        max_profit = max(max_profit, potential_profit)
    #print max_profit
    return max_profit

stock_prices_yesterday = [[10, 7, 5, 8, 11, 9],
                          [16, 15, 13, 10, 6, 1],
                          [0,1,5,1,1,1,1]]
for prices in stock_prices_yesterday:
    print get_max_profit(prices)
    # returns 6 (buying for $5 and selling for $11)
