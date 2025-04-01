package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < numberOfNumbers; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());

            if(i % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        }

        if(evenSum == oddSum)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        }
        else
        {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
