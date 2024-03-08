package AdvancedConditionalStatements.Lab;

import java.util.Scanner;

public class CinemaTicket
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch(day)
        {
            case "Monday":
                System.out.println(12);
                break;
            case "Tuesday":
                System.out.println(12);
                break;
            case "Wednesday":
                System.out.println(14);
                break;
            case "Thursday":
                System.out.println(14);
                break;
            case "Friday":
                System.out.println(12);
                break;
            case "Saturday":
                System.out.println(16);
                break;
            case "Sunday":
                System.out.println(16);
                break;
        }
    }
}
