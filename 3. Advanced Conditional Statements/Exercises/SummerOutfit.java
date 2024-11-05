package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;
public class SummerOutfit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if(timeOfTheDay.equalsIgnoreCase("Morning"))
        {
            if(degrees >= 10 && degrees <= 18)
            {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if(degrees > 18 && degrees <= 24)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees >= 25)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if(timeOfTheDay.equalsIgnoreCase("Afternoon"))
        {
            if(degrees >= 10 && degrees <= 18)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees > 18 && degrees <= 24)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else if(degrees >= 25)
            {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        else if(timeOfTheDay.equalsIgnoreCase("Evening"))
        {
            if(degrees >= 10 && degrees <= 18)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees > 18 && degrees <= 24)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees >= 25)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
