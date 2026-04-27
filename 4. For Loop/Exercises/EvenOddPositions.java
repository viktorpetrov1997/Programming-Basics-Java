package ForLoop.Exercises;

import java.util.Scanner;

public class EvenOddPositions
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.NEGATIVE_INFINITY;

        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.NEGATIVE_INFINITY;

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 1; i <= n; i++)
        {
            double number = Double.parseDouble(scanner.nextLine());

            if(i % 2 == 0)
            {
                evenSum += number;

                ++evenCount;

                if(number < evenMin)
                {
                    evenMin = number;
                }

                if(number > evenMax)
                {
                    evenMax = number;
                }
            }
            else
            {
                oddSum += number;

                ++oddCount;

                if(number < oddMin)
                {
                    oddMin = number;
                }

                if(number > oddMax)
                {
                    oddMax = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f%n", oddSum);

        if(oddCount == 0)
        {
            System.out.println("OddMin=No");
            System.out.println("OddMax=No");
        }
        else
        {
            System.out.printf("OddMin=%.2f%n", oddMin);
            System.out.printf("OddMax=%.2f%n", oddMax);
        }

        System.out.printf("EvenSum=%.2f%n", evenSum);

        if(evenCount == 0)
        {
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        }
        else
        {
            System.out.printf("EvenMin=%.2f%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
