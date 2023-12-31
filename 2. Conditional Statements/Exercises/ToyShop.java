package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double priceForTrip = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numberOfToys = puzzles + dolls + teddyBears + minions + trucks;

        double totalEarnings = (puzzles * 2.60) + (dolls * 3) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2);

        if(numberOfToys >= 50)
        {
            totalEarnings *= 0.75;
        }

        totalEarnings -= totalEarnings * 0.1;

        if(totalEarnings >= priceForTrip)
        {
            System.out.printf("Yes! %.2f lv left.",totalEarnings - priceForTrip);
        }
        else
        {
            System.out.printf("Not enough money! %.2f lv needed.",priceForTrip - totalEarnings);
        }
    }
}
