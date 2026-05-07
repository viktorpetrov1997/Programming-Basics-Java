package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfUnsatisfactoryGrades = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        String lastProblem = "";

        int numberOfUnsatisfactoryGradesReached = 0;
        int numberOfProblems = 0;
        int gradesSum = 0;

        boolean isNumberOfUnsatisfactoryGradesReached = false;

        while(!input.equals("Enough"))
        {
            String taskName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if(grade <= 4)
            {
                ++numberOfUnsatisfactoryGradesReached;
            }

            ++numberOfProblems;

            gradesSum += grade;

            lastProblem = taskName;

            if(numberOfUnsatisfactoryGradesReached == numberOfUnsatisfactoryGrades)
            {
                isNumberOfUnsatisfactoryGradesReached = true;
                break;
            }

            input = scanner.nextLine();
        }

        double averageGrade = gradesSum * 1.0 / numberOfProblems;

        if(isNumberOfUnsatisfactoryGradesReached)
        {
            System.out.printf("You need a break, %d poor grades.", numberOfUnsatisfactoryGrades);
        }
        else
        {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
