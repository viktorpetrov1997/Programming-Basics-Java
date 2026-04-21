package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int volumeOfPool = Integer.parseInt(scanner.nextLine());
        int firstPipeFlowRate = Integer.parseInt(scanner.nextLine());
        int secondPipeFlowRate = Integer.parseInt(scanner.nextLine());
        double hoursInWhichWorkerIsAbsent = Double.parseDouble(scanner.nextLine());

        double totalWaterAmount = (firstPipeFlowRate + secondPipeFlowRate) * hoursInWhichWorkerIsAbsent;

        if(totalWaterAmount <= volumeOfPool)
        {
            double percentFull = (totalWaterAmount / volumeOfPool) * 100;

            double firstPipeAmount = firstPipeFlowRate * hoursInWhichWorkerIsAbsent;
            double secondPipeAmount = secondPipeFlowRate * hoursInWhichWorkerIsAbsent;

            double firstPipeAmountInPercentage = (firstPipeAmount / totalWaterAmount) * 100;
            double secondPipeAmountInPercentage = (secondPipeAmount / totalWaterAmount) * 100;

            System.out.printf("The pool is %.2f full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.%n", percentFull,
                    firstPipeAmountInPercentage, secondPipeAmountInPercentage);
        }
        else
        {
            double waterOverflow = totalWaterAmount - volumeOfPool;

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.%n", hoursInWhichWorkerIsAbsent,
                    waterOverflow);
        }
    }
}
