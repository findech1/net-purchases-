import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Gross Salary: ");
        double grossSalary = scanner.nextDouble();

        double taxRate;

        if (grossSalary > 50000) {
            taxRate = 0.30;
        } else if (grossSalary > 40000) {
            taxRate = 0.20;
        } else if (grossSalary > 20000) {
            taxRate = 0.10;
        } else if (grossSalary > 10000) {
            taxRate = 0.05;
        } else {
            taxRate = 0.0;
        }

        double taxAmount = grossSalary * taxRate;
        double netSalary = grossSalary - taxAmount;

        System.out.println("------------------------------");
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Tax Rate     : " + (int)(taxRate * 100) + "%");
        System.out.println("Tax Amount   : " + taxAmount);
        System.out.println("Net Salary   : " + netSalary);
        System.out.println("------------------------------");

        scanner.close();
    }
}