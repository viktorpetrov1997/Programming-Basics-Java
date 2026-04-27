package ForLoop.Exercises;

import java.util.Scanner;

public class DivisionWithoutRemainder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int totalNumberOfNumbers = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for(int i = 0; i < totalNumberOfNumbers; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());

            if(number % 2 == 0)
            {
                ++p1;
            }

            if(number % 3 == 0)
            {
                ++p2;
            }

            if(number % 4 == 0)
            {
                ++p3;
            }
        }

        p1 = p1 / totalNumberOfNumbers * 100;
        p2 = p2 / totalNumberOfNumbers * 100;
        p3 = p3 / totalNumberOfNumbers * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
