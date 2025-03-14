package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class HotelRoom
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double studioPricePerNight = 0;
        double apartmentPricePerNight = 0;

        if(month.equals("May") || month.equals("October"))
        {
            studioPricePerNight = 50;
            apartmentPricePerNight = 65;
        }
        else if(month.equals("June") || month.equals("September"))
        {
            studioPricePerNight = 75.20;
            apartmentPricePerNight = 68.70;
        }
        else if(month.equals("July") || month.equals("August"))
        {
            studioPricePerNight = 76;
            apartmentPricePerNight = 77;
        }

        double totalPriceForStudio = studioPricePerNight * numberOfNights;
        double totalPriceForApartment = apartmentPricePerNight * numberOfNights;

        if((month.equals("May") || month.equals("October")) && numberOfNights > 14)
        {
            totalPriceForStudio *= 0.70;
        }
        else if((month.equals("May") || month.equals("October")) && numberOfNights > 7)
        {
            totalPriceForStudio *= 0.95;
        }
        else if((month.equals("June") || month.equals("September")) && numberOfNights > 14)
        {
            totalPriceForStudio *= 0.80;
        }

        if(numberOfNights > 14)
        {
            totalPriceForApartment *= 0.90;
        }

        System.out.printf("Apartment: %.2f lv.%n", totalPriceForApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceForStudio);
    }
}
