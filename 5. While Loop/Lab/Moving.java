package WhileLoop.Lab;

import java.util.Scanner;

public class Moving
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int widthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightOfFreeSpace = Integer.parseInt(scanner.nextLine());

        int cubicMetersOfFreeSpace = widthOfFreeSpace * lengthOfFreeSpace * heightOfFreeSpace;

        int cubicMetersOfOccupiedSpace = 0;

        String input = scanner.nextLine();

        while(!input.equals("Done"))
        {
            int numberOfCartons = Integer.parseInt(input);

            cubicMetersOfOccupiedSpace += numberOfCartons;

            if(cubicMetersOfOccupiedSpace > cubicMetersOfFreeSpace)
            {
                System.out.printf("No more free space! You need %d Cubic meters more.", cubicMetersOfOccupiedSpace - cubicMetersOfFreeSpace);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d Cubic meters left.", cubicMetersOfFreeSpace - cubicMetersOfOccupiedSpace);
    }
}
