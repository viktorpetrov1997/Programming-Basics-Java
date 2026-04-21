package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine().toLowerCase();
        double litersOfFuel = Double.parseDouble(scanner.nextLine());

        if(typeOfFuel.equals("diesel") || typeOfFuel.equals("gasoline") || typeOfFuel.equals("gas"))
        {
            if(litersOfFuel < 25)
            {
                System.out.printf("Fill your tank with %s!", typeOfFuel);
            }
            else
            {
                System.out.printf("You have enough %s.", typeOfFuel);
            }
        }
        else
        {
            System.out.println("Invalid fuel!");
        }
    }
}
