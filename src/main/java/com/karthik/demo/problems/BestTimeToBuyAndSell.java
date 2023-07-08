package com.karthik.demo.problems;

public class BestTimeToBuyAndSell {

  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};

    var maxProfit = BestTimeToBuyAndSell.calMaxProfit(prices);
    System.out.println(maxProfit);
  }

  static int calMaxProfit(int[] prices) {
    int firstPurchase = prices[0];
    int maxProfit = 0;
    for(int i = 1; i< prices.length;i++){
      if(prices[i] < firstPurchase)
        firstPurchase = prices[i];
      else if(prices[i] - firstPurchase > maxProfit) {
        maxProfit = prices[i] - firstPurchase;
      }
    }

    return maxProfit;
  }
}
