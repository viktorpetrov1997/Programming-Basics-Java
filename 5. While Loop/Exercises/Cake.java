package WhileLoop.Exercises;

import java.util.Scanner;

public class Cake
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int totalNumberOfPiecesOfCake = cakeWidth * cakeLength;

        String input = scanner.nextLine();;

        while(!input.equals("STOP"))
        {
            int numberOfPiecesOfCakeTaken = Integer.parseInt(input);

            totalNumberOfPiecesOfCake -= numberOfPiecesOfCakeTaken;

            if(totalNumberOfPiecesOfCake < 0)
            {
                break;
            }

            input = scanner.nextLine();
        }

        if(totalNumberOfPiecesOfCake > 0)
        {
            System.out.printf("%d pieces are left.", totalNumberOfPiecesOfCake);
        }
        else
        {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalNumberOfPiecesOfCake));
        }
    }
}
