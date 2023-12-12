package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceForChickenMenus = chickenMenus * 10.35;
        double priceForFishMenus = fishMenus * 12.4;
        double priceForVegetarianMenus = vegetarianMenu * 8.15;
        double totalMenusPrice = priceForChickenMenus + priceForFishMenus + priceForVegetarianMenus;
        double priceForDesert = totalMenusPrice * 0.2;
        double deliveryPrice = 2.5;
        double totalPrice = totalMenusPrice + priceForDesert + deliveryPrice;
        System.out.println(totalPrice);
    }
}
