package ForLoop.Lab;

import java.util.Scanner;

public class VowelsSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int vowelsSum = 0;

        for(int i = 0; i < input.length(); i++)
        {
            char currentLetter = input.charAt(i);

            switch(currentLetter)
            {
                case 'a': vowelsSum += 1; break;
                case 'e': vowelsSum += 2; break;
                case 'i': vowelsSum += 3; break;
                case 'o': vowelsSum += 4; break;
                case 'u': vowelsSum += 5; break;
            }
        }

        System.out.println(vowelsSum);
    }
}
