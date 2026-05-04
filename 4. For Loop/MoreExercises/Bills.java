package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills
{
    private static final int MONTHLY_WATER_BILL= 20;
    private static final int MONTHLY_INTERNET_BILL = 15;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfMonths = Integer.parseInt(scanner.nextLine());

        double totalElectricityBill = 0;
        double waterBill = 0;
        double internetBill = 0;
        double otherBills = 0;

        for(int i = 0; i < numberOfMonths; i++)
        {
            double electricityBill = Double.parseDouble(scanner.nextLine());

            totalElectricityBill += electricityBill;
            waterBill += MONTHLY_WATER_BILL;
            internetBill += MONTHLY_INTERNET_BILL;

            double otherBill = (electricityBill + MONTHLY_WATER_BILL + MONTHLY_INTERNET_BILL) * 1.20;
            otherBills += otherBill;
        }

        double totalExpenses = totalElectricityBill + waterBill + internetBill + otherBills;
        double averageBill = totalExpenses / numberOfMonths;

        System.out.printf("Electricity: %.2f lv%n", totalElectricityBill);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv%n", averageBill);
    }
}
