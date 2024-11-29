import java.util.Scanner;

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
            case 5:
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
        workPeriod();
    }
    public Cashier(String name) {
        CashRegister cashRegister = new CashRegister(name);
        workPeriod();
    }

    public void workPeriod() {
        CashRegister cashRegister = new CashRegister();
        Scanner input = new Scanner(System.in);
        int choice;
        double price;
        do {
            System.out.println("Choice a product 1-Salad 2-Burger 3-Pizza 4-Desert ENTER '5' FOR EXIT");
             choice= input.nextInt();
            System.out.println("What's the price of product ?");
             price = input.nextDouble();
           cashRegister.calculate(choice, price);
        }while(choice != 5);
       cashRegister.saleSlip();
}
    }

