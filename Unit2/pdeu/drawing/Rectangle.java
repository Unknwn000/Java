package pdeu.drawing;

public class Rectangle extends Shape
{
    double length;
    double width;

    public Rectangle()
    {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(String color, String pattern, double length, double width)
    {
        super(color, pattern);
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {
        return (length*width);
    }

    public double calculatePerimeter()
    {
        return (2*length + 2*width);
    }

    
}
