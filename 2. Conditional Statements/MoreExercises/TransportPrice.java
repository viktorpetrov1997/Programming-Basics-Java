package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice
{
    private static final double TAXI_INITIAL_FEE = 0.7;
    private static final double TAXI_NIGHTTIME_FEE = 0.9;
    private static final double TAXI_DAYTIME_FEE = 0.79;
    private static final double BUS_FEE = 0.09;
    private static final double TRAIN_FEE = 0.06;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfKilometers = Integer.parseInt(scanner.nextLine());
        String dayTimeOrNightTimeTravel = scanner.nextLine();

        double costOfTravel = 0;

        if(numberOfKilometers < 20)
        {
            if(dayTimeOrNightTimeTravel.equals("day"))
            {
                costOfTravel = TAXI_INITIAL_FEE + (numberOfKilometers * TAXI_DAYTIME_FEE);
            }
            else
            {
                costOfTravel = TAXI_INITIAL_FEE + (numberOfKilometers * TAXI_NIGHTTIME_FEE);
            }
        }
        else if(numberOfKilometers < 100)
        {
            costOfTravel = numberOfKilometers * BUS_FEE;
        }
        else
        {
            costOfTravel = numberOfKilometers * TRAIN_FEE;
        }

        System.out.printf("%.2f", costOfTravel);
    }
}
