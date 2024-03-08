package AdvancedConditionalStatements;

import java.util.Scanner;

public class TradeCommissions
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();

        double salesVolume = Double.parseDouble(scanner.nextLine());
        if(salesVolume < 0)
        {
            System.out.println("error");
            return;
        }

        double commissionPercent = 0;

        if(city.equals("Sofia"))
        {
            if(salesVolume >= 0 && salesVolume <= 500)
            {
                commissionPercent = 5;
            }
            else if(salesVolume > 500 && salesVolume <= 1000)
            {
                commissionPercent = 7;
            }
            else if(salesVolume > 1000 && salesVolume <= 10000)
            {
                commissionPercent = 8;
            }
            else if(salesVolume > 10000)
            {
                commissionPercent = 12;
            }
        }
        else if(city.equals("Varna"))
        {
            if(salesVolume >= 0 && salesVolume <= 500)
            {
                commissionPercent = 4.5;
            }
            else if(salesVolume > 500 && salesVolume <= 1000)
            {
                commissionPercent = 7.5;
            }
            else if(salesVolume > 1000 && salesVolume <= 10000)
            {
                commissionPercent = 10;
            }
            else if(salesVolume > 10000)
            {
                commissionPercent = 13;
            }
        }
        else if(city.equals("Plovdiv"))
        {
            if(salesVolume >= 0 && salesVolume <= 500)
            {
                commissionPercent = 5.5;
            }
            else if(salesVolume > 500 && salesVolume <= 1000)
            {
                commissionPercent = 8;
            }
            else if(salesVolume > 1000 && salesVolume <= 10000)
            {
                commissionPercent = 12;
            }
            else if(salesVolume > 10000)
            {
                commissionPercent = 14.5;
            }
        }
        else
        {
            System.out.println("error");
            return;
        }

        double commission = salesVolume * (commissionPercent / 100);
        System.out.printf("%.2f", commission);
    }
}
