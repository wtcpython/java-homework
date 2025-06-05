// Exercise 9.2
package com.wtc.homework;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.35);
        stock.setPreviousClosingPrice(34.5);
        System.out.println("Percent change: " + stock.getChangePercent());
    }
}
