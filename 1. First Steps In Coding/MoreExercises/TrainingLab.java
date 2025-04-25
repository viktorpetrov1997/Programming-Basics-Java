package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double lengthInMeters = Double.parseDouble(scanner.nextLine());
        double widthInMeters = Double.parseDouble(scanner.nextLine());

        int lengthInCentimeters = (int) (lengthInMeters * 100);
        int widthInCentimeters = (int) (widthInMeters * 100);

        int deskWidth = 70;
        int deskLength = 120;

        int desksPerRow = (widthInCentimeters - 100) / deskWidth;
        int rows = lengthInCentimeters / deskLength;

        int totalSeats = desksPerRow * rows;

        totalSeats -= 3;

        System.out.println(totalSeats);
    }
}
