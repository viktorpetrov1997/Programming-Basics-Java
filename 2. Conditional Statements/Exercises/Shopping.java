package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfVideoCards = Integer.parseInt(scanner.nextLine());
        int numberOfProcessors = Integer.parseInt(scanner.nextLine());
        int numberOfRamMemories = Integer.parseInt(scanner.nextLine());

        int priceForVideoCards = numberOfVideoCards * 250;
        double priceForProcessors = (priceForVideoCards * 0.35) * numberOfProcessors;
        double priceForRamMemory = (priceForVideoCards * 0.1) * numberOfRamMemories;

        double totalPrice = priceForVideoCards + priceForProcessors + priceForRamMemory;

        if(numberOfVideoCards > numberOfProcessors)
        {
            totalPrice *= 0.85;
        }

        if(budget >= totalPrice)
        {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
