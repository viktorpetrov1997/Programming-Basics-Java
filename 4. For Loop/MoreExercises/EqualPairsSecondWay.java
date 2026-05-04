package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairsSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int previousSum = 0;
        int maxDifference = 0;
        boolean allNumbersAreEqual = true;

        for (int i = 0; i < n; i++)
        {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondSecond = Integer.parseInt(scanner.nextLine());

            int currentSum = firstNumber + secondSecond;

            if(i > 0)
            {
                int difference = Math.abs(currentSum - previousSum);

                if(difference != 0)
                {
                    allNumbersAreEqual = false;
                }

                if(difference > maxDifference)
                {
                    maxDifference = difference;
                }
            }

            previousSum = currentSum;
        }

        if(allNumbersAreEqual)
        {
            System.out.printf("Yes, value=%d", previousSum);
        }
        else
        {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }
    }
}
