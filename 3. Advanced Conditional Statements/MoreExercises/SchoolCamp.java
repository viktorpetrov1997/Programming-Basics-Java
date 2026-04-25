package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SchoolCamp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double pricePerNightPerPerson = 0;
        String typeOfSport = "";

        if(season.equals("Winter"))
        {
            if(typeOfGroup.equals("girls"))
            {
                typeOfSport = "Gymnastics";
                pricePerNightPerPerson = 9.6;
            }
            else if(typeOfGroup.equals("boys"))
            {
                typeOfSport = "Judo";
                pricePerNightPerPerson = 9.6;
            }
            else if(typeOfGroup.equals("mixed"))
            {
                typeOfSport = "Ski";
                pricePerNightPerPerson = 10;
            }
        }
        else if(season.equals("Spring"))
        {
            if(typeOfGroup.equals("girls"))
            {
                typeOfSport = "Athletics";
                pricePerNightPerPerson = 7.2;
            }
            else if(typeOfGroup.equals("boys"))
            {
                typeOfSport = "Tennis";
                pricePerNightPerPerson = 7.2;
            }
            else if(typeOfGroup.equals("mixed"))
            {
                typeOfSport = "Cycling";
                pricePerNightPerPerson = 9.5;
            }
        }
        else if(season.equals("Summer"))
        {
            if(typeOfGroup.equals("girls"))
            {
                typeOfSport = "Volleyball";
                pricePerNightPerPerson = 15;
            }
            else if(typeOfGroup.equals("boys"))
            {
                typeOfSport = "Football";
                pricePerNightPerPerson = 15;
            }
            else if(typeOfGroup.equals("mixed"))
            {
                typeOfSport = "Swimming";
                pricePerNightPerPerson = 20;
            }
        }

        double priceForAccommodationForAllStudents = numberOfStudents * pricePerNightPerPerson * numberOfNights;

        if(numberOfStudents >= 50)
        {
            priceForAccommodationForAllStudents *= 0.5;
        }
        else if(numberOfStudents >= 20)
        {
            priceForAccommodationForAllStudents *= 0.85;
        }
        else if(numberOfStudents >= 10)
        {
            priceForAccommodationForAllStudents *= 0.95;
        }

        System.out.printf("%s %.2f lv.", typeOfSport, priceForAccommodationForAllStudents);
    }
}
