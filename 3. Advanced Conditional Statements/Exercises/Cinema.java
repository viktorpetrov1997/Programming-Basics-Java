package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class Cinema
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        int numberOfRows = Integer.parseInt(scanner.nextLine());
        int numberOfColumns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if(typeOfProjection.equalsIgnoreCase("Premiere"))
        {
            income = numberOfRows * numberOfColumns * 12;
        }
        else if(typeOfProjection.equalsIgnoreCase("Normal"))
        {
            income = numberOfRows * numberOfColumns * 7.50;
        }
        else if(typeOfProjection.equalsIgnoreCase("Discount"))
        {
            income = numberOfRows * numberOfColumns * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}
