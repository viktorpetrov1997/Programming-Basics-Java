package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceOfToy = Integer.parseInt(scanner.nextLine());

        int numberOfToys = 0;
        int moneySaved = 0;
        int giftMoney = 10;

        for(int i = 1; i <= age; i++)
        {
            if(i % 2 != 0)
            {
                ++numberOfToys;
            }
            else
            {
                moneySaved += giftMoney;
                giftMoney += 10;
                moneySaved -= 1;
            }
        }

        moneySaved += numberOfToys * priceOfToy;

        if(moneySaved >= priceOfWashingMachine)
        {
            System.out.printf("Yes! %.2f", moneySaved - priceOfWashingMachine);
        }
        else
        {
            System.out.printf("No! %.2f", priceOfWashingMachine - moneySaved);
        }
    }
}
