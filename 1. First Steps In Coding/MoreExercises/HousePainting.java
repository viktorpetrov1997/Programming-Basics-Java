package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double sideWallLength = Double.parseDouble(scanner.nextLine());
        double triangularWallOnRoofHeight = Double.parseDouble(scanner.nextLine());

        double sideWallWindowArea = 1.5 * 1.5;
        double sideWallArea = houseHeight * sideWallLength;
        double sideWallsArea = 2 * sideWallArea - 2 * sideWallWindowArea;

        double frontWallDoorArea = 1.2 * 2;
        double frontAndBackWallsArea = (houseHeight * houseHeight) * 2 - frontWallDoorArea;

        double totalWallsArea = sideWallsArea + frontAndBackWallsArea;

        double totalGreenPaint = totalWallsArea / 3.4;

        System.out.printf("%.2f%n", totalGreenPaint);

        double rectanglesOnRoofArea = 2 * (houseHeight * sideWallLength);
        double trianglesOnRoofArea = 2 * (houseHeight * triangularWallOnRoofHeight / 2);
        double totalRoofArea = rectanglesOnRoofArea + trianglesOnRoofArea;

        double totalRedPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f", totalRedPaint);
    }
}
