package ForLoop.Exercises;

import java.util.Scanner;

public class TennisRankList
{
    private static final int NUMBER_OF_POINTS_FOR_WIN = 2000;
    private static final int NUMBER_OF_POINTS_FOR_FINALIST = 1200;
    private static final int NUMBER_OF_POINTS_FOR_SEMIFINALIST = 720;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int initialPointsInTheRankList = Integer.parseInt(scanner.nextLine());

        int totalNumberOfPoints = initialPointsInTheRankList;
        int numberOfTournamentsWon = 0;

        for(int i = 0; i < numberOfTournaments; i++)
        {
            String tournamentStageReached = scanner.nextLine();

            switch(tournamentStageReached)
            {
                case "W" ->
                {
                    totalNumberOfPoints += NUMBER_OF_POINTS_FOR_WIN;
                    ++numberOfTournamentsWon;
                }
                case "F" -> totalNumberOfPoints += NUMBER_OF_POINTS_FOR_FINALIST;
                case "SF" -> totalNumberOfPoints += NUMBER_OF_POINTS_FOR_SEMIFINALIST;
            }
        }

        int averagePoints = (totalNumberOfPoints - initialPointsInTheRankList) / numberOfTournaments;
        double percentOfTournamentsWon = numberOfTournamentsWon * 1.0 / numberOfTournaments * 100;

        System.out.printf("Final points: %d%n", totalNumberOfPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentOfTournamentsWon);
    }
}
