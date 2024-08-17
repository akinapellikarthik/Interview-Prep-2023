package com.karthik.demo;

public class CanPlaceFlowers {

  public static void main(String[] args) {
    var b = new CanPlaceFlowers().canPlaceFlowers(new int[] {0, 0, 1, 0, 1}, 1);
    System.out.println(b);
  }

  public boolean canPlaceFlowers(int[] flowerbed, int n) {

    for (int i = 0, j = 1; i < flowerbed.length && j < flowerbed.length; i++, j++) {
      if (flowerbed[i] == 0 && flowerbed[j] == 0) {
        flowerbed[j] = 1;
        n--;
      }
    }

    return n == 0;
  }
}
