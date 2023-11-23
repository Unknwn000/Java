import java.util.Scanner;
public class Math {
    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first element:");
        double num1 = sc.nextInt();
        System.out.println("Enter the second element: ");
        double num2 = sc.nextInt();

        System.out.println("The addition of " + num1 + " and " + num2 + " is " + (num1+num2));
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + (num1-num2));
        System.out.println("The multiplicaion of " + num1 + " and " + num2 + " is " + (num1*num2));
        System.out.println("The divition of " + num1 + " and " + num2 + " is " + (num1/num2));
        sc.close();
    }

}

