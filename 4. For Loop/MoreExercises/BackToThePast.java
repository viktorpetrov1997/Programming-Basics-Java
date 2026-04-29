package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast
{
    private static final int YEAR_HE_RETURNED_TO = 1800;
    private static final int INITIAL_AGE = 18;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int theYearHeMustLiveUntil = Integer.parseInt(scanner.nextLine());

        int age = INITIAL_AGE;

        for(int i = YEAR_HE_RETURNED_TO; i <= theYearHeMustLiveUntil; i++)
        {
            if(i % 2 == 0)
            {
                inheritedMoney -= 12000;
            }
            else
            {
                inheritedMoney -= 12000 + (50 * age);
            }

            ++age;
        }

        if(inheritedMoney >= 0)
        {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        }
        else
        {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
