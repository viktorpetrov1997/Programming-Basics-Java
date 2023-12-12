package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int safetyNylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hoursWork = Integer.parseInt(scanner.nextLine());

        double priceForSafetyNylon = (safetyNylon + 2) * 1.5;
        double priceForPaint = (paint + paint * 0.1) * 14.5;
        double priceForPaintThinner = paintThinner * 5;
        double bagPrice = 0.4;
        double totalPrice = priceForSafetyNylon + priceForPaint + priceForPaintThinner + bagPrice;
        double sumForWork = (totalPrice * 0.3) * hoursWork;
        double finalPrice = totalPrice + sumForWork;
        System.out.println(finalPrice);
    }
}
