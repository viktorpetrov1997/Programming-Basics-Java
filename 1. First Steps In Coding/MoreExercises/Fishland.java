package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double priceForKilogramOfMackerel = Double.parseDouble(scanner.nextLine());
        double priceForKilogramOfSprat = Double.parseDouble(scanner.nextLine());
        double kilogramsOfBonito = Double.parseDouble(scanner.nextLine());
        double kilogramsOfScad = Double.parseDouble(scanner.nextLine());
        int kilogramsOfMussels = Integer.parseInt(scanner.nextLine());

        double priceOfBonito = kilogramsOfBonito * (priceForKilogramOfMackerel * 1.6);
        double priceOfScad = kilogramsOfScad * (priceForKilogramOfSprat * 1.8);
        double priceOfMussels = kilogramsOfMussels * 7.5;

        double totalPrice = priceOfBonito + priceOfScad + priceOfMussels;

        System.out.printf("%.2f", totalPrice);
    }
}
