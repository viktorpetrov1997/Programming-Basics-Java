package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BirthdayParty
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double cake = rent * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = rent * (1.0 / 3.0);

        double neededSumOfMoney = rent + cake + drinks + animator;

        System.out.println(neededSumOfMoney);
    }
}
