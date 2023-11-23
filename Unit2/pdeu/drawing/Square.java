package pdeu.drawing;

public class Square extends Shape implements Resizeable
{
    double length;

    public Square()
    {
        super();
        length = 0;
    }

    public Square(String color, String pattern, double length)
    {
        super(color, pattern);
        this.length = length;
    }

    public double calculateArea()
    {
        return (length*length);
    }

    public double calculatePerimeter()
    {
        return (4*length);
    }

    public void resize(int length)
    {
        this.length = length;
    }
}

