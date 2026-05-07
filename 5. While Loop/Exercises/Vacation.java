package WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double moneyNeededForTrip = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int numberOfConsecutiveDaysOfSpending = 0;
        int numberOfDays = 0;

        while(availableMoney < moneyNeededForTrip && numberOfConsecutiveDaysOfSpending < 5)
        {
            String typeOfAction = scanner.nextLine();
            double amountToBeSpentOrSaved = Double.parseDouble(scanner.nextLine());

            ++numberOfDays;

            if(typeOfAction.equals("spend"))
            {
                availableMoney -= amountToBeSpentOrSaved;

                if(availableMoney < 0)
                {
                    availableMoney = 0;
                }

                ++numberOfConsecutiveDaysOfSpending;
            }
            else if(typeOfAction.equals("save"))
            {
                availableMoney += amountToBeSpentOrSaved;
                numberOfConsecutiveDaysOfSpending = 0;
            }
        }

        if(availableMoney >= moneyNeededForTrip)
        {
            System.out.printf("You saved the money for %d days.", numberOfDays);
        }

        if(numberOfConsecutiveDaysOfSpending == 5)
        {
            System.out.println("You can't save the money.");
            System.out.println(numberOfDays);
        }
    }
}
