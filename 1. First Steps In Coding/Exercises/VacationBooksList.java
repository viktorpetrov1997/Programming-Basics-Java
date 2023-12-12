package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesForOneHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int timeToReadBook = numberOfPages / pagesForOneHour;
        int hoursForOneDay = timeToReadBook / numberOfDays;
        System.out.println(hoursForOneDay);
    }
}
