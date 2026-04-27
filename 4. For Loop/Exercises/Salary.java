package ForLoop.Exercises;

import java.util.Scanner;

public class Salary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfOpenTabsInTheBrowser = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numberOfOpenTabsInTheBrowser; i++)
        {
            String visitedWebsite = scanner.nextLine();

            if(visitedWebsite.equals("Facebook"))
            {
                salary -= 150;
            }
            else if(visitedWebsite.equals("Instagram"))
            {
                salary -= 100;
            }
            else if(visitedWebsite.equals("Reddit"))
            {
                salary -= 50;
            }

            if(salary <= 0) break;
        }

        if(salary <= 0)
        {
            System.out.println("You have lost your salary.");
        }
        else
        {
            System.out.println(salary);
        }
    }
}
