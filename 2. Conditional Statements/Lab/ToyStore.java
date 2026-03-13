package ConditionalStatements.Lab;

import java.util.Scanner;

public class ToyStore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());

        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfTalkingDolls = Integer.parseInt(scanner.nextLine());
        int numberOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = numberOfPuzzles * 2.60;
        double talkingDollsPrice = numberOfTalkingDolls * 3;
        double teddyBearsPrice = numberOfTeddyBears * 4.10;
        double minionsPrice = numberOfMinions * 8.20;
        double trucksPrice = numberOfTrucks * 2;

        double totalSum = puzzlesPrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        int numberOfAllToys = numberOfPuzzles + numberOfTalkingDolls + numberOfTeddyBears + numberOfMinions
                + numberOfTrucks;

        if(numberOfAllToys >= 50)
        {
            totalSum *= 0.75;
        }

        totalSum *= 0.9;

        if(totalSum > tripPrice)
        {
            double moneyLeft = totalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }
        else
        {
            double moneyNeeded = tripPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }
}
