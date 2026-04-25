package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Vacation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String placeToStay = "";
        String location = "";
        double priceForVacation = 0;

        if(budget <= 1000)
        {
            placeToStay = "Camp";

            if(season.equals("Summer"))
            {
                location = "Alaska";
                priceForVacation = budget * 0.65;
            }
            else if(season.equals("Winter"))
            {
                location = "Morocco";
                priceForVacation = budget * 0.45;
            }
        }
        else if(budget > 1000 & budget <= 3000)
        {
            placeToStay = "Hut";

            if(season.equals("Summer"))
            {
                location = "Alaska";
                priceForVacation = budget * 0.8;
            }
            else if(season.equals("Winter"))
            {
                location = "Morocco";
                priceForVacation = budget * 0.6;
            }
        }
        else if(budget > 3000)
        {
            placeToStay = "Hotel";

            if(season.equals("Summer"))
            {
                location = "Alaska";
            }
            else if(season.equals("Winter"))
            {
                location = "Morocco";
            }

            priceForVacation = budget * 0.9;
        }

        System.out.printf("%s - %s - %.2f", location, placeToStay, priceForVacation);
    }
}
