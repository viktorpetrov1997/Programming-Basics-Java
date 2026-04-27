package ForLoop.Exercises;

import java.util.Scanner;

public class Histogram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int totalNumberOfNumbers = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for(int i = 0; i < totalNumberOfNumbers; i++)
        {
            int number = Integer.parseInt(scanner.nextLine());

            if(number < 200)
            {
                ++p1;
            }
            else if(number <= 399)
            {
                ++p2;
            }
            else if(number <= 599)
            {
                ++p3;
            }
            else if(number <= 799)
            {
                ++p4;
            }
            else
            {
                ++p5;
            }
        }

        p1 = p1 / totalNumberOfNumbers * 100;
        p2 = p2 / totalNumberOfNumbers * 100;
        p3 = p3 / totalNumberOfNumbers * 100;
        p4 = p4 / totalNumberOfNumbers * 100;
        p5 = p5 / totalNumberOfNumbers * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
