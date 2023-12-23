package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if(figure.equals("square"))
        {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * side);
        }
        else if(figure.equals("rectangle"))
        {
            double firstSide = Double.parseDouble(scanner.nextLine());
            double secondSide = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", firstSide * secondSide);
        }
        else if(figure.equals("circle"))
        {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI * Math.pow(radius,2));
        }
        else if(figure.equals("triangle"))
        {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * height * 0.5);
        }
    }
}
