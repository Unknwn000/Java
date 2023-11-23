import java.util.*;
import java.lang.Math;
public class PrimeNo 
{
    static boolean IsPrime(int num) 
    {
        int i;
        boolean flag = false;
        for(i=2; i<=Math.sqrt(num); i++)
        {
            if(num % i ==0)
                flag = true;
        }
        return flag;
    }
    public static void main(String[] s)
    {
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter how many first prime numbers you want to print: ");
        int n = sc.nextInt();
        int i = 2;
        int count = 0;
        System.out.println("The first " + n + " prime numbers are: ");

        while(count < n)
        {
            if (IsPrime(i) == false)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }
        sc.close();
    }
}
