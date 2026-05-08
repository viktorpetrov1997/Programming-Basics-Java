package WhileLoop.Exercises;

import java.util.Scanner;

public class Walking
{
    private static final int GOAL = 10000;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfStepsTaken = 0;

        String input = scanner.nextLine();

        while(!input.equals("Going home"))
        {
            int numberOfStepsForDay = Integer.parseInt(input);

            numberOfStepsTaken += numberOfStepsForDay;

            if(numberOfStepsTaken >= GOAL)
            {
                break;
            }

            input = scanner.nextLine();
        }

        if(input.equals("Going home"))
        {
            int numberOfStepsToHome = Integer.parseInt(scanner.nextLine());
            numberOfStepsTaken += numberOfStepsToHome;
        }

        if(numberOfStepsTaken > GOAL)
        {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", numberOfStepsTaken - GOAL);
        }
        else
        {
            System.out.printf("%d more steps to reach goal.", GOAL - numberOfStepsTaken);
        }
    }
}
