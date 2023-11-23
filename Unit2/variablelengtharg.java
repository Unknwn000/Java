public class variablelengtharg
{
    public static int addNumbers(int... numbers) 
    {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int sum = addNumbers(1, 2, 3, 4, 5);
        System.out.println("The sum-1 is: " + sum);

        sum = addNumbers(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println("The sum-2 is: " + sum);
    }
}
