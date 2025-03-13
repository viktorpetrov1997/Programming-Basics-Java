package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        boolean isEven = false;

        if(operator.equals("+"))
        {
            result = N1 + N2;
            isEven = ((int) result) % 2 == 0;
            System.out.printf("%d + %d = %d - %s%n", N1, N2, (int) result, isEven ? "even" : "odd");

        }
        else if(operator.equals("-"))
        {
            result = N1 - N2;
            isEven = ((int) result) % 2 == 0;
            System.out.printf("%d - %d = %d - %s%n", N1, N2, (int) result, isEven ? "even" : "odd");

        }
        else if(operator.equals("*"))
        {
            result = N1 * N2;
            isEven = ((int) result) % 2 == 0;
            System.out.printf("%d * %d = %d - %s%n", N1, N2, (int) result, isEven ? "even" : "odd");

        }
        else if(operator.equals("/"))
        {
            if(N2 == 0)
            {
                System.out.printf("Cannot divide %d by zero%n", N1);
            }
            else
            {
                result = (double) N1 / N2;
                System.out.printf("%d / %d = %.2f%n", N1, N2, result);
            }

        }
        else if(operator.equals("%"))
        {
            if(N2 == 0)
            {
                System.out.printf("Cannot divide %d by zero%n", N1);
            }
            else
            {
                result = N1 % N2;
                System.out.printf("%d %% %d = %d%n", N1, N2, (int) result);
            }
        }
    }
}
