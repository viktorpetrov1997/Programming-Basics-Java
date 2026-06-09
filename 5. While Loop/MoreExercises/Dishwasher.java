package WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfBottlesOfDetergent = Integer.parseInt(scanner.nextLine());
        int amountOfDetergent = numberOfBottlesOfDetergent * 750;

        int dishesCount = 0;
        int potsCount = 0;

        int loadNumber = 0;

        String input = scanner.nextLine();

        while(!input.equals("End"))
        {
            int numberOfDishesOrPots = Integer.parseInt(input);
            loadNumber++;

            int neededAmountOfDetergent;

            if(loadNumber % 3 == 0)
            {
                neededAmountOfDetergent = numberOfDishesOrPots * 15;
                potsCount += numberOfDishesOrPots;
            }
            else
            {
                neededAmountOfDetergent = numberOfDishesOrPots * 5;
                dishesCount += numberOfDishesOrPots;
            }

            if(amountOfDetergent >= neededAmountOfDetergent)
            {
                amountOfDetergent -= neededAmountOfDetergent;
            }
            else
            {
                int shortage = neededAmountOfDetergent - amountOfDetergent;
                System.out.printf("Not enough detergent, %d ml. more necessary!", shortage);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n", dishesCount, potsCount);
        System.out.printf("Leftover detergent %d ml.%n", amountOfDetergent);
    }
}
