package pdeu.drawing;
public class Triangle extends Shape
{
    double base;
    double height;

    public Triangle()
    {
        super();
        base = 0;
        height = 0;
    }

    public Triangle(String color, String pattern, double base, double height)
    {
        super(color, pattern);
        this.base = base;
        this.height = height;
    }

    public double calculateArea()
    {
        return (base*height*0.5);
    }

    public double calculatePerimeter()
    {
        return (3*base);
    }

    
}

