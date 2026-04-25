package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class CarToGo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String typeOfCar = "";
        double carPrice = 0;

        if(budget <= 100)
        {
            carClass = "Economy class";

            if(season.equals("Summer"))
            {
                typeOfCar = "Cabrio";
                carPrice = budget * 0.35;
            }
            else if(season.equals("Winter"))
            {
                typeOfCar = "Jeep";
                carPrice = budget * 0.65;
            }
        }
        else if(budget > 100 && budget <= 500)
        {
            carClass = "Compact class";

            if(season.equals("Summer"))
            {
                typeOfCar = "Cabrio";
                carPrice = budget * 0.45;
            }
            else if(season.equals("Winter"))
            {
                typeOfCar = "Jeep";
                carPrice = budget * 0.8;
            }
        }
        else if(budget > 500)
        {
            carClass = "Luxury class";

            typeOfCar = "Jeep";
            carPrice = budget * 0.9;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", typeOfCar, carPrice);
    }
}
