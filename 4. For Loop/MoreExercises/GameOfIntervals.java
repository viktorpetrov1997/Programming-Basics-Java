package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfMoves = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;

        int count0to9 = 0;
        int count10to19 = 0;
        int count20to29 = 0;
        int count30to39 = 0;
        int count40to50 = 0;
        int invalid = 0;

        for(int i = 0; i < numberOfMoves; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());

            if(number >= 0 && number <= 9)
            {
                totalPoints += number * 0.20;
                ++count0to9;
            }
            else if(number >= 10 && number <= 19)
            {
                totalPoints += number * 0.30;
                ++count10to19;
            }
            else if (number >= 20 && number <= 29)
            {
                totalPoints += number * 0.40;
                ++count20to29;
            }
            else if (number >= 30 && number <= 39)
            {
                totalPoints += 50;
                ++count30to39;
            }
            else if (number >= 40 && number <= 50)
            {
                totalPoints += 100;
                ++count40to50;
            }
            else
            {
                totalPoints /= 2;
                ++invalid;
            }
        }

        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", count0to9 * 100.0 / numberOfMoves);
        System.out.printf("From 10 to 19: %.2f%%%n", count10to19 * 100.0 / numberOfMoves);
        System.out.printf("From 20 to 29: %.2f%%%n", count20to29 * 100.0 / numberOfMoves);
        System.out.printf("From 30 to 39: %.2f%%%n", count30to39 * 100.0 / numberOfMoves);
        System.out.printf("From 40 to 50: %.2f%%%n", count40to50 * 100.0 / numberOfMoves);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid * 100.0 / numberOfMoves);
    }
}
