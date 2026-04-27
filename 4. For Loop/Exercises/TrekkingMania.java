package ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroupsOfClimbers = Integer.parseInt(scanner.nextLine());

        int numberOfClimbersClimbingMusala = 0;
        int numberOfClimbersClimbingMontBlanc = 0;
        int numberOfClimbersClimbingKilimanjaro = 0;
        int numberOfClimbersClimbingK2 = 0;
        int numberOfClimbersClimbingEverest = 0;

        int totalNumberOfClimbers = 0;

        for(int i = 0; i < numberOfGroupsOfClimbers; i++)
        {
            int numberOfClimbersInGroup = Integer.parseInt(scanner.nextLine());

            totalNumberOfClimbers += numberOfClimbersInGroup;

            if(numberOfClimbersInGroup <= 5)
            {
                numberOfClimbersClimbingMusala += numberOfClimbersInGroup;
            }
            else if(numberOfClimbersInGroup <= 12)
            {
                numberOfClimbersClimbingMontBlanc += numberOfClimbersInGroup;
            }
            else if(numberOfClimbersInGroup <= 25)
            {
                numberOfClimbersClimbingKilimanjaro += numberOfClimbersInGroup;
            }
            else if(numberOfClimbersInGroup <= 40)
            {
                numberOfClimbersClimbingK2 += numberOfClimbersInGroup;
            }
            else
            {
                numberOfClimbersClimbingEverest += numberOfClimbersInGroup;
            }
        }

        double percentOfClimbersClimbingMusala = numberOfClimbersClimbingMusala * 1.0 / totalNumberOfClimbers * 100;
        double percentOfClimbersClimbingMontBlanc = numberOfClimbersClimbingMontBlanc * 1.0 / totalNumberOfClimbers * 100;
        double percentOfClimbersClimbingKilimanjaro = numberOfClimbersClimbingKilimanjaro * 1.0 / totalNumberOfClimbers * 100;
        double percentOfClimbersClimbingK2 = numberOfClimbersClimbingK2 * 1.0 / totalNumberOfClimbers * 100;
        double percentOfClimbersClimbingEverest = numberOfClimbersClimbingEverest * 1.0 / totalNumberOfClimbers * 100;

        System.out.printf("%.2f%%%n", percentOfClimbersClimbingMusala);
        System.out.printf("%.2f%%%n", percentOfClimbersClimbingMontBlanc);
        System.out.printf("%.2f%%%n", percentOfClimbersClimbingKilimanjaro);
        System.out.printf("%.2f%%%n", percentOfClimbersClimbingK2);
        System.out.printf("%.2f%%%n", percentOfClimbersClimbingEverest);
    }
}
