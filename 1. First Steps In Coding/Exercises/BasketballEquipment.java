package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());
        double priceForSneakers = fee - (fee * 0.4);
        double clothes = priceForSneakers - (priceForSneakers * 0.2);
        double ball = clothes * 0.25;
        double accessories = ball * (1.0 / 5);
        double totalPrice = fee + priceForSneakers + clothes + ball + accessories;
        System.out.println(totalPrice);
    }
}
