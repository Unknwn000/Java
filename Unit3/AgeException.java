import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class License {
    public void applyForLicense(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. You are not eligible for a license.");
        }
        System.out.println("License granted. You are eligible to drive.");
    }
}

public class AgeException {
    public static void main(String[] args) {
        License license = new License();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int applicantAge = sc.nextInt(); 
        try {
            license.applyForLicense(applicantAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
