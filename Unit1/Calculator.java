import java.util.*;
import java.lang.Math;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select\n 1 : Addition\n 2 : Subtraction\n 3 : Multiplication\n 4 : Division\n 5 : Square Root\n 6 : Natural Log\n 7 : Power\n 8 : Sin");

        int value = sc.nextInt();
        switch (value)
        {
            case 1:
            System.out.println("Enter the 1st number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the 2nd number: ");
            double num2 = sc.nextDouble();
            System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1+num2));
            break;

            case 2:
            System.out.println("Enter the 1st number: ");
            double num3 = sc.nextDouble();
            System.out.println("Enter the 2nd number: ");
            double num4 = sc.nextDouble();
            System.out.println("Subtraction of " + num3 + " and " + num4 + " is: " + (num3-num4));
            break;

            case 3:
            System.out.println("Enter the 1st number: ");
            double num5 = sc.nextDouble();
            System.out.println("Enter the 2nd number: ");
            double num6 = sc.nextDouble();
            System.out.println("Multiplication of " + num5 + " and " + num6 + " is: " + (num5*num6));
            break;

            case 4:
            System.out.println("Enter the 1st number: ");
            double num7 = sc.nextDouble();
            System.out.println("Enter the 2nd number: ");
            double num8 = sc.nextDouble();
            System.out.println("Division of " + num7 + " and " + num8 + " is: " + (num7/num8));
            break;

            case 5:
            System.out.println("Enter the number for Square Root: ");
            double num9 = sc.nextDouble();
            System.out.println("Square Root of " + num9 + " is " + Math.sqrt(num9));
            break;

            case 6:
            System.out.println("Enter the number : ");
            double num10 = sc.nextDouble();
            System.out.println("Log of " + num10 + " is " + Math.log(num10));
            break;

            case 7:
            System.out.println("Enter the base: ");
            double num11 = sc.nextDouble();
            System.out.println("Enter the power: ");
            double num12 = sc.nextDouble();
            System.out.println("Power is " + Math.pow(num11, num12));
            break;

            case 8:
            System.out.println("Enter the value of theta for Sin");
            double num13 = sc.nextDouble();
            System.out.println("Sin " + num13 + " is " + Math.sin(num13));
            break;

            default:
            break;  
            
        }
        sc.close();
    }
}

