package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class MultiplyByTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double number = 0;

        while(true)
        {
            number = Double.parseDouble(scanner.nextLine());

            if(number >= 0)
            {
                number *= 2;

                System.out.printf("Result: %.2f\n", number);
            }
            else
            {
                System.out.println("Negative number!");
                break;
            }
        }
    }
}
