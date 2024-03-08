package AdvancedConditionalStatements;

import java.util.Scanner;

public class SkiTrip
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = days - 1;

        double priceForRoomForOnePerson = 18 * nights;
        double priceForApartment = 25 * nights;
        double priceForPresidentialApartment = 35 * nights;

        double totalPrice = 0;

        if(typeOfRoom.equals("apartment"))
        {
            if(nights < 10)
            {
                priceForApartment -= priceForApartment * 0.30;
            }
            else if(nights >= 10 && nights <= 15)
            {
                priceForApartment -= priceForApartment * 0.35;
            }
            else if(nights > 15)
            {
                priceForApartment -= priceForApartment * 0.50;
            }
            totalPrice += priceForApartment;
        }
        else if(typeOfRoom.equals("president apartment"))
        {
            if(days < 10)
            {
                priceForPresidentialApartment -= priceForPresidentialApartment * 0.10;
            }
            else if(nights >= 10 && days <= 15)
            {
                priceForPresidentialApartment -= priceForPresidentialApartment * 0.15;
            }
            else if (nights > 15)
            {
                priceForPresidentialApartment -= priceForPresidentialApartment * 0.20;
            }
            totalPrice += priceForPresidentialApartment;
        }
        else if(typeOfRoom.equals("room for one person"))
        {
            totalPrice += priceForRoomForOnePerson;
        }

        if(assessment.equals("positive"))
        {
            if(typeOfRoom.equals("room for one person"))
            {
                totalPrice += priceForRoomForOnePerson * 0.25;
            }
            else if(typeOfRoom.equals("apartment"))
            {
                totalPrice += priceForApartment * 0.25;
            }
            else if(typeOfRoom.equals("president apartment"))
            {
                totalPrice += priceForPresidentialApartment * 0.25;
            }
        }
        else if(assessment.equals("negative"))
        {
            if(typeOfRoom.equals("room for one person"))
            {
                totalPrice -= priceForRoomForOnePerson * 0.10;
            }
            else if(typeOfRoom.equals("apartment"))
            {
                totalPrice -= priceForApartment * 0.10;
            }
            else if(typeOfRoom.equals("president apartment"))
            {
                totalPrice -= priceForPresidentialApartment * 0.10;
            }
        }

        System.out.printf("%.2f", totalPrice);
    }
}
