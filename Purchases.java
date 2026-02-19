import java.util.Scanner;

public class Purchases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchases = scanner.nextDouble();

        double discountRate = (purchases > 50000) ? 0.20 : 0.10;
        double discount = purchases * discountRate;
        double netPurchases = purchases - discount;

        System.out.println("Purchase Amount : " + purchases);
        System.out.println("Discount Rate   : " + (int)(discountRate * 100) + "%");
        System.out.println("Discount Amount : " + discount);
        System.out.println("Net Purchases   : " + netPurchases);

        scanner.close();
    }
}
