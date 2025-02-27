package com.karthik.demo.java17.fp.examples;

interface DiscountAmount {
  Double calculateDiscount(Double amount);
}

class RegularCustomer implements DiscountAmount {

  @Override
  public Double calculateDiscount(Double amount) {
    return amount * 0.1;
  }
}

class PremiumCustomer implements DiscountAmount {

  @Override
  public Double calculateDiscount(Double amount) {
    return amount * 0.2;
  }
}

class VIPCustomer implements DiscountAmount {

  @Override
  public Double calculateDiscount(Double amount) {
    return amount * 0.3;
  }
}

class DiscountCalculator {
  DiscountAmount discountAmount;

  public DiscountCalculator(DiscountAmount discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Double discount(Double amount) {
    if (discountAmount != null) {
      return discountAmount.calculateDiscount(amount);
    }
    return 0.00d;
  }
}

public class Performio {

  public static void main(String[] args) {
    DiscountCalculator discountCalculator = new DiscountCalculator(new RegularCustomer());
    Double discount = discountCalculator.discount(100.12);
    System.out.println(discount);
    DiscountCalculator vipDiscount = new DiscountCalculator(new VIPCustomer());
    Double vipDiscountD = vipDiscount.discount(100.00);
    System.out.println(vipDiscountD);
  }
}
