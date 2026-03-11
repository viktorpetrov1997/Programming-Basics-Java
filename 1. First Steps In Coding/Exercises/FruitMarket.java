package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FruitMarket
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());

        double bananasAmountInKg = Double.parseDouble(scanner.nextLine());
        double orangesAmountInKg = Double.parseDouble(scanner.nextLine());
        double raspberriesAmountInKg = Double.parseDouble(scanner.nextLine());
        double strawberriesAmountInKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.5;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        double bananasSum = bananasPrice * bananasAmountInKg;
        double orangesSum = orangesPrice * orangesAmountInKg;
        double raspberriesSum = raspberriesPrice * raspberriesAmountInKg;
        double strawberriesSum = strawberriesPrice * strawberriesAmountInKg;

        double totalSum = bananasSum + orangesSum + raspberriesSum + strawberriesSum;

        System.out.printf("%.2f", totalSum);
    }
}
