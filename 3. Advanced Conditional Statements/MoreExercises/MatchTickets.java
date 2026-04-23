package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class MatchTickets
{
    private static final double VIP_TICKET_PRICE = 499.99;
    private static final double NORMAL_TICKET_PRICE = 249.99;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        double priceForTransport = 0;

        if(numberOfPeople >= 1 && numberOfPeople <= 4)
        {
            priceForTransport = budget * 0.75;
        }
        else if(numberOfPeople >= 5 && numberOfPeople <= 9)
        {
            priceForTransport = budget * 0.6;
        }
        else if(numberOfPeople >= 10 && numberOfPeople <= 24)
        {
            priceForTransport = budget * 0.5;
        }
        else if(numberOfPeople >= 25 && numberOfPeople <= 49)
        {
            priceForTransport = budget * 0.4;
        }
        else if(numberOfPeople >= 50)
        {
            priceForTransport = budget * 0.25;
        }

        double moneyLeftAfterTransportExpenses = budget - priceForTransport;

        double priceForTickets = 0;

        if(category.equals("VIP"))
        {
            priceForTickets = numberOfPeople * VIP_TICKET_PRICE;
        }
        else if(category.equals("Normal"))
        {
            priceForTickets = numberOfPeople * NORMAL_TICKET_PRICE;
        }

        if(moneyLeftAfterTransportExpenses > priceForTickets)
        {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeftAfterTransportExpenses - priceForTickets);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva.", priceForTickets - moneyLeftAfterTransportExpenses);
        }
    }
}
