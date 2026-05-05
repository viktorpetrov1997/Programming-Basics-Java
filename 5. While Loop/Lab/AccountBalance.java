package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double accountBalance = 0;

        String input = scanner.nextLine();

        while(!input.equals("NoMoreMoney"))
        {
            double amountOfMoney = Double.parseDouble(input);

            if(amountOfMoney > 0)
            {
                accountBalance += amountOfMoney;
                System.out.printf("Increase: %.2f%n", amountOfMoney);
            }
            else
            {
                System.out.println("Invalid operation!");
                break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", accountBalance);
    }
}
