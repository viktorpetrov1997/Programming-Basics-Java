package ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for(int i = 0; i < numberOfNumbers; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        System.out.println(sum);
    }
}
