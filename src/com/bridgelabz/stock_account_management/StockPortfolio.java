package com.bridgelabz.stock_account_management;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    int numberOfStocks;
    Scanner scr = new Scanner(System.in);

    ArrayList<Stock> list= new ArrayList<>();

    public StockPortfolio() {
    }

    void stockPortfolio() {

        System.out.println("Enter no of stocks");
        numberOfStocks = scr.nextInt();

        for (int i = 0; i <numberOfStocks; i++) {
            Stock stock = new Stock();
            System.out.println("Enter stock name");
            stock.setStockName(scr.next());
            System.out.println("Enter number of shares");
            stock.setNumberOfShare(scr.nextInt());
            System.out.println("Enter each share price");
            stock.setSharePrice( scr.nextDouble());
            list.add(stock);
        }
    }

    void valueOfStock(){
        double totalValue=0;
        for(Stock stock : list){
            double stockValue = stock.getNumberOfShare()*stock.getSharePrice();
            System.out.println("Stock value of  "+ stock.getStockName()+ " is "+ stockValue);
            totalValue+=stockValue;
        }
        System.out.println("Value of total stock is: "+totalValue);
    }

    void displayData(){
        for(Stock stock : list){
            System.out.println(stock);
        }
    }
}


