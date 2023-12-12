package FirstStepsInCoding;

import java.util.Scanner;

public class InchesToCentimeters
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double inchesToCentimeters = inches * 2.54;
        System.out.printf("%.2f",inchesToCentimeters);
    }
}
