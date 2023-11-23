public class nestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4] / 0;  // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of range");
        } catch (Exception e) {
            System.out.println("Exception: Something went wrong");
        }

        System.out.println("Program continues after the catch blocks.");

        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[1] / 0;  // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of range");
        } catch (Exception e) {
            System.out.println("Exception: Something went wrong");
        }
    }
}
