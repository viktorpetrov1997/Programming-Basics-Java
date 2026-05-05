package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;

        String input = scanner.nextLine();

        while(!input.equals("Stop"))
        {
            int number = Integer.parseInt(input);

            if(number > maxNumber)
            {
                maxNumber = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}
