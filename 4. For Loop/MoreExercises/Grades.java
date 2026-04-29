package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudentsWhoTookExam = Integer.parseInt(scanner.nextLine());

        double totalGrades = 0;
        double topGrades = 0;
        double goodGrades = 0;
        double satisfactoryGrades = 0;
        double failedGrades = 0;

        for(int i = 0; i < numberOfStudentsWhoTookExam; i++)
        {
            double grade = Double.parseDouble(scanner.nextLine());

            totalGrades += grade;

            if(grade < 3)
            {
                ++failedGrades;
            }
            else if(grade <= 3.99)
            {
                ++satisfactoryGrades;
            }
            else if(grade <= 4.99)
            {
                ++goodGrades;
            }
            else
            {
                ++topGrades;
            }
        }

        double topStudents = topGrades / numberOfStudentsWhoTookExam * 100;
        double goodStudents = goodGrades / numberOfStudentsWhoTookExam * 100;
        double satisfactoryStudents = satisfactoryGrades / numberOfStudentsWhoTookExam * 100;
        double failedStudents = failedGrades / numberOfStudentsWhoTookExam * 100;
        double averageGrade = totalGrades / numberOfStudentsWhoTookExam;

        System.out.printf("Top students: %.2f%%%n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", satisfactoryStudents);
        System.out.printf("Fail: %.2f%%%n", failedStudents);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
