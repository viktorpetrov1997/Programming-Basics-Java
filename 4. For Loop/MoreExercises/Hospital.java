package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int numberOfDoctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for(int i = 1; i <= numberOfDays; i++)
        {
            if(i % 3 == 0)
            {
                if(untreatedPatients > treatedPatients)
                {
                    ++numberOfDoctors;
                }
            }

            int numberOfPatients = Integer.parseInt(scanner.nextLine());

            if(numberOfPatients <= numberOfDoctors)
            {
                treatedPatients += numberOfPatients;
            }
            else
            {
                treatedPatients += numberOfDoctors;
                untreatedPatients += (numberOfPatients - numberOfDoctors);
            }
        }

        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");
    }
}
