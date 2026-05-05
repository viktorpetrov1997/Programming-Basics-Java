package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = 0;

        while(sumOfNumbers < initialNumber)
        {
            int number = Integer.parseInt(scanner.nextLine());

            sumOfNumbers += number;
        }

        System.out.println(sumOfNumbers);
    }
}
