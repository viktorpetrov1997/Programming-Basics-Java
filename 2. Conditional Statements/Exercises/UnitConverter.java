package ConditionalStatements.Exercises;

import java.util.Scanner;

public class UnitConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double numberToConvert = Double.parseDouble(scanner.nextLine());
        String initialUnit = scanner.nextLine();
        String desiredUnitResult = scanner.nextLine();

        double valueInMeters = 0;

        if(initialUnit.equals("mm"))
        {
            valueInMeters = numberToConvert / 1000;
        }
        else if(initialUnit.equals("cm"))
        {
            valueInMeters = numberToConvert / 100;
        }
        else if(initialUnit.equals("m"))
        {
            valueInMeters = numberToConvert;
        }

        double finalResult = 0;

        if(desiredUnitResult.equals("mm"))
        {
            finalResult = valueInMeters * 1000;
        }
        else if(desiredUnitResult.equals("cm"))
        {
            finalResult = valueInMeters * 100;
        }
        else if(desiredUnitResult.equals("m"))
        {
            finalResult = valueInMeters;
        }

        System.out.printf("%.3f%n", finalResult);
    }
}
