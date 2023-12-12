package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int durationOfDeposit = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        double accumulatedRate = depositSum * (annualInterestRate / 100);
        double rateForOneMonth = accumulatedRate / 12;
        double totalSum = depositSum + (durationOfDeposit * rateForOneMonth);
        System.out.println(totalSum);
    }
}
