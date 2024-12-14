 class CashRegister {

    double totalSale;
    double dailyProfit;
    double profitSalad;
    int desertSaleCount;
    int saladSaleCount;


    public CashRegister() {
        System.out.println("Welcome to the Cash Register");
    }

    public CashRegister(String name) {
        System.out.println("Welcome to the Cash Register " + name);
    }




    public void calculate(int choice, double price) {
        calculateTotalsale(price);
        calculateDailyProfit(choice, price);
    }

    private void calculateTotalsale(double price) {
        totalSale += price;
    }

    private void calculateDailyProfit(int choice, double price) {
        switch (choice) {
            case 1:
                dailyProfit += price * 0.3;
                calculateTotalsale(price);
                calculateProfitSalad(price * 0.3);
                saladSaleCount++;
                break;
            case 2:
                dailyProfit += price * 0.25;
                calculateTotalsale(price);
            case 3:
                dailyProfit += price * 0.35;
                calculateTotalsale(price);
            case 4:
                dailyProfit += price * 0.2;
                calculateTotalsale(price);
                increaseSellofDesert();
                break;
        }
    }

    private void calculateProfitSalad(double profit) {
        profitSalad += profit;
    }

    private void increaseSellofDesert() {
        desertSaleCount++;
    }

    public void saleSlip() {
        System.out.println("Total sale amount: " + totalSale);
        System.out.println("Daily profit amount: " + dailyProfit);
        System.out.println("Average of salad profit: " + profitSalad / saladSaleCount);
        System.out.println("Desert sale amount: " + desertSaleCount);
    }


}
class Cashier {


    public Cashier() {
        CashRegister cashRegister = new CashRegister();

    }
    public Cashier(String name) {CashRegister cashRegister = new CashRegister(name);}

    public void workPeriod() {
        CashRegister cashRegister = new CashRegister();
        SafeScannerForInt scanner = new SafeScannerForInt();
        int choice;
        double price;
        while (true) {
            System.out.println("Choice a product 1-Salad 2-Burger 3-Pizza 4-Desert ENTER '5' FOR EXIT");
choice=scanner.numberFormatExpectionHandler();
if(choice==5) {break;}
while(choice<1||choice>5) {
    System.out.println("Please enter a valid choice");
    choice=scanner.numberFormatExpectionHandler();
}

            System.out.println("What's the price of product ?");

price=scanner.numberFormatExpectionHandler();
while(price==0){
    System.out.println("Price cannot be zero");price=scanner.numberFormatExpectionHandler();
}
           cashRegister.calculate(choice, price);
        }
       cashRegister.saleSlip();
}
    }



