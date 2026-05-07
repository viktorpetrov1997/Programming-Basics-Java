package WhileLoop.Exercises;

import java.util.Scanner;

public class OldBooks
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String input = scanner.nextLine();

        int numberOfCheckedBooks = 0;
        boolean isBookFound = false;

        while(!input.equals("No More Books"))
        {
            String bookName = input;

            if(bookName.equals(searchedBook))
            {
                isBookFound = true;
                break;
            }

            ++numberOfCheckedBooks;

            input = scanner.nextLine();
        }

        if(isBookFound)
        {
            System.out.printf("You checked %d books and found it.", numberOfCheckedBooks);
        }
        else
        {
            System.out.printf("The book you search is not here!%nYou checked %d books.%n", numberOfCheckedBooks);
        }
    }
}
