class InvalidBoxException extends RuntimeException {
    public InvalidBoxException(String message) {
        super(message);
    }
}

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new InvalidBoxException("Invalid dimensions for the Box. All dimensions must be greater than zero.");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class InvalidException {
    public static void main(String[] args) {
        try {
            Box box1 = new Box(66, 3.0, 4.0); // Valid dimensions
            System.out.println("Box 1 Volume: " + box1.calculateVolume());

            Box box2 = new Box(0, 3.0, 4.0); // Invalid dimension (length is zero)
        } catch (InvalidBoxException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
