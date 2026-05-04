package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        int numbersIndex = 0;

        int pairSum = 0;

        for(int i = 1; i <= n * 2; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());

            pairSum += number;

            if(i % 2 == 0)
            {
                numbers[numbersIndex] = pairSum;
                ++numbersIndex;
                pairSum = 0;
            }
        }

        boolean allNumbersAreEqual = true;
        int maxDifference = 0;

        for(int i = 0; i < numbers.length - 1; i++)
        {
            int difference = Math.abs(numbers[i] - numbers[i + 1]);

            if(difference != 0)
            {
                allNumbersAreEqual = false;
            }

            if(difference > maxDifference)
            {
                maxDifference = difference;
            }
        }

        if(allNumbersAreEqual)
        {
            System.out.printf("Yes, value=%d", numbers[0]);
        }
        else
        {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }
    }
}
