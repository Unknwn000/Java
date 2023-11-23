import java.util.Scanner;

public class Consonant_Vowel 
{
    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String str = sc.nextLine();

        int constant = 0;
        int vovel = 0;

        for (int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if (Character.isLetter(c))
            {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                {
                    constant++;
                }
                else
                {
                    vovel++;
                }
            }
        }
        System.out.println("The vovels in the string are: " + vovel);
        System.out.println("The constants in the string are: " + constant);
        sc.close();
    }
}

 
