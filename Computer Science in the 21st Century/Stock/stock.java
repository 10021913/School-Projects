class stock {
  public static void main(String[] args) {


    // Varibales
    int bought_number =  1000;
    double Stock_price = 23.87; //Dollars
    int sold_number = 1000;
    double commission = 0.02;
    double stock_sold = 33.92; //Dollars

    // Total Buy Cost
    double commision1 = (bought_number * Stock_price) * commission;
    double total_stock_cost = commision1 + (bought_number * Stock_price);
    double extra = total_stock_cost - commision1;

    //Total Sell Profit
    double profit = sold_number * stock_sold;
    double commision_2 = profit * commission;
    double sub_net_profit = profit - commision_2;

    //Net profit
    double Net_Profit = sub_net_profit - total_stock_cost;


    //Printing Data
    System.out.println("Joe's Acme Software Inc Stock Transactions:\n\n\n");

    System.out.println("Stocks Cost \t\t\t\t\t\t\t $ "+ extra);
    System.out.println("Commission Paid While Buying \t\t\t\t\t $ " + commision1 );
    System.out.println("Stock Sold  \t\t\t\t\t\t\t $ " + profit);
    System.out.println("Commission Paid While selling  \t\t\t\t\t $ " + commision_2  );
    System.out.println("Net Profit In Dollars** \t\t\t\t\t $ " + Net_Profit);
    System.out.println("\n\n\n**Joe Must pay Taxes ");


  }
}
