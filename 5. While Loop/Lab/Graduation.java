package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation
{
    private static final int TOTAL_GRADES = 12;
    private static final double PASS_GRADE = 4.0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int numberOfTimesStudentFailed = 0;

        double totalGrades = 0;

        for(int gradeLevel = 1; gradeLevel <= TOTAL_GRADES; gradeLevel++)
        {
            double grade = Double.parseDouble(scanner.nextLine());

            if(grade < PASS_GRADE)
            {
                ++numberOfTimesStudentFailed;

                if(numberOfTimesStudentFailed == 2)
                {
                    System.out.printf("%s has been excluded at %d grade", studentName, gradeLevel - 1);
                    return;
                }
            }

            totalGrades += grade;
        }

        double averageGrade = totalGrades / TOTAL_GRADES;
        System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
    }
}
