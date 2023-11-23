//Write a program to count the number of words that start with capital letters.
import java.util.Scanner;

public class isUppercase 
{
    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        int count = 0;

        for (String word : words)
        {
            if (Character.isUpperCase(word.charAt(0)))
            {
                count++;
            }
        }
        System.out.println("The number of words starting with capital letters are: " + count);
        sc.close();

    }
    
}

