package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numberOfAllFans = Integer.parseInt(scanner.nextLine());

        int numberOfFansInSectorA = 0;
        int numberOfFansInSectorB = 0;
        int numberOfFansInSectorV = 0;
        int numberOfFansInSectorG = 0;

        for(int i = 0; i < numberOfAllFans; i++)
        {
            String sector = scanner.nextLine();

            if(sector.equals("A"))
            {
                ++numberOfFansInSectorA;
            }
            else if(sector.equals("B"))
            {
                ++numberOfFansInSectorB;
            }
            else if(sector.equals("V"))
            {
                ++numberOfFansInSectorV;
            }
            else if(sector.equals("G"))
            {
                ++numberOfFansInSectorG;
            }
        }

        double percentOfFansInSectorA = numberOfFansInSectorA * 1.0 / numberOfAllFans * 100;
        double percentOfFansInSectorB = numberOfFansInSectorB * 1.0 / numberOfAllFans * 100;
        double percentOfFansInSectorV = numberOfFansInSectorV * 1.0 / numberOfAllFans * 100;
        double percentOfFansInSectorG = numberOfFansInSectorG * 1.0 / numberOfAllFans * 100;
        double percentOfOccupiedSeatsInTheStadium = numberOfAllFans * 1.0 / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", percentOfFansInSectorA);
        System.out.printf("%.2f%%%n", percentOfFansInSectorB);
        System.out.printf("%.2f%%%n", percentOfFansInSectorV);
        System.out.printf("%.2f%%%n", percentOfFansInSectorG);
        System.out.printf("%.2f%%%n", percentOfOccupiedSeatsInTheStadium);
    }
}
