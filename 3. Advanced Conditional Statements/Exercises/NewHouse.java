package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class NewHouse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if(flower.equals("Roses"))
        {
            price = numberOfFlowers * 5;
            if(numberOfFlowers > 80)
            {
                price *= 0.90;
            }
        }
        else if(flower.equals("Dahlias"))
        {
            price = numberOfFlowers * 3.80;
            if(numberOfFlowers > 90)
            {
                price *= 0.85;
            }
        }
        else if(flower.equals("Tulips"))
        {
            price = numberOfFlowers * 2.80;
            if(numberOfFlowers > 80)
            {
                price *= 0.85;
            }
        }
        else if(flower.equals("Narcissus"))
        {
            price = numberOfFlowers * 3;
            if(numberOfFlowers < 120)
            {
                price *= 1.15;
            }
        }
        else if(flower.equals("Gladiolus"))
        {
            price = numberOfFlowers * 2.50;
            if(numberOfFlowers < 80)
            {
                price *= 1.20;
            }
        }

        double moneyLeft = budget - price;

        if(budget >= price)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numberOfFlowers, flower, moneyLeft);
        }
        else
        {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(moneyLeft));
        }
    }
}
