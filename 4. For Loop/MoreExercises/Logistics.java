package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics
{
    private static final int PRICE_PER_TON_OF_CARGO_TRANSPORTED_BY_VAN = 200;
    private static final int PRICE_PER_TON_OF_CARGO_TRANSPORTED_BY_TRUCK = 175;
    private static final int PRICE_PER_TON_OF_CARGO_TRANSPORTED_BY_TRAIN = 120;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoadsToBeTransported = Integer.parseInt(scanner.nextLine());

        int totalCargoTransportedByVan = 0;
        int totalCargoTransportedByTruck = 0;
        int totalCargoTransportedByTrain = 0;
        int totalCargoWeight = 0;

        for(int i = 0; i < numberOfLoadsToBeTransported; i++)
        {
            int cargoWeight = Integer.parseInt(scanner.nextLine());

            totalCargoWeight += cargoWeight;

            if(cargoWeight <= 3)
            {
                totalCargoTransportedByVan += cargoWeight;
            }
            else if(cargoWeight <= 11)
            {
                totalCargoTransportedByTruck += cargoWeight;
            }
            else
            {
                totalCargoTransportedByTrain += cargoWeight;
            }
        }

        double averageCostPerTonOfTransportedCargo = (totalCargoTransportedByVan * PRICE_PER_TON_OF_CARGO_TRANSPORTED_BY_VAN
                + totalCargoTransportedByTruck * PRICE_PER_TON_OF_CARGO_TRANSPORTED_BY_TRUCK
                + totalCargoTransportedByTrain * PRICE_PER_TON_OF_CARGO_TRANSPORTED_BY_TRAIN) * 1.0 / totalCargoWeight;

        double percentOfCargoTransportedByVan = totalCargoTransportedByVan * 1.0 / totalCargoWeight * 100;
        double percentOfCargoTransportedByTruck = totalCargoTransportedByTruck * 1.0 / totalCargoWeight * 100;
        double percentOfCargoTransportedByTrain = totalCargoTransportedByTrain * 1.0 / totalCargoWeight * 100;

        System.out.printf("%.2f%n", averageCostPerTonOfTransportedCargo);
        System.out.printf("%.2f%%%n", percentOfCargoTransportedByVan);
        System.out.printf("%.2f%%%n", percentOfCargoTransportedByTruck);
        System.out.printf("%.2f%%%n", percentOfCargoTransportedByTrain);
    }
}
