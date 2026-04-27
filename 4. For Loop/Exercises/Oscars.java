package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars
{
    private static final double POINTS_NEEDED_TO_GET_A_NOMINATION = 1250.5;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfAssessors = Integer.parseInt(scanner.nextLine());

        double numberOfPointsForTheActor = academyPoints;

        for(int i = 0; i < numberOfAssessors; i++)
        {
            String assessorName = scanner.nextLine();
            double assessorPoints = Double.parseDouble(scanner.nextLine());

            numberOfPointsForTheActor += assessorName.length() * assessorPoints / 2;

            if(numberOfPointsForTheActor >= POINTS_NEEDED_TO_GET_A_NOMINATION) break;
        }

        if(numberOfPointsForTheActor >= POINTS_NEEDED_TO_GET_A_NOMINATION)
        {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, numberOfPointsForTheActor);
        }
        else
        {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, POINTS_NEEDED_TO_GET_A_NOMINATION - numberOfPointsForTheActor);
        }
    }
}
