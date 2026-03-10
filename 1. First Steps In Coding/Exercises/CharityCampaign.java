package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class CharityCampaign
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfDaysForCampaign = Integer.parseInt(scanner.nextLine());
        int numberOfPastryChefs = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double profitFromCakes = numberOfCakes * 45;
        double profitFromWaffles = numberOfWaffles * 5.80;
        double profitFromPancakes = numberOfPancakes * 3.20;

        double totalProfitForOneDayForAllPastryChefs = (profitFromCakes + profitFromWaffles + profitFromPancakes) * numberOfPastryChefs;

        double totalProfitForTheEntireCampaign = totalProfitForOneDayForAllPastryChefs * numberOfDaysForCampaign;

        double totalProfitAfterExpenses = totalProfitForTheEntireCampaign - (totalProfitForTheEntireCampaign * 0.125);

        System.out.printf("%.2f", totalProfitAfterExpenses);
    }
}
