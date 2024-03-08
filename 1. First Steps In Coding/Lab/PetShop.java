package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOtherPets = Integer.parseInt(scanner.nextLine());
        double dogFood = numberOfDogs * 2.5;
        int otherFood = numberOfOtherPets * 4;
        double finalSum = dogFood + otherFood;
        System.out.println(finalSum + " lv.");
    }
}
