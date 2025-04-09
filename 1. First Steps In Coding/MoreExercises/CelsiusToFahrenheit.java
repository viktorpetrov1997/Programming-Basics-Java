package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = (9 * 1.0 / 5) * celsius + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
